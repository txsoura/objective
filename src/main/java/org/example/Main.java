package org.example;

import org.example.models.InventoryCost;
import org.example.seeds.InventoryCostSeeder;
import org.example.service.AverageCostCalculatorService;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<InventoryCost> inventoryCostSeeder = new InventoryCostSeeder().seeds();

        Map<String, Double> averageCosts = AverageCostCalculatorService.calculate(inventoryCostSeeder);

        for (String item : averageCosts.keySet()) {
            double averageCost = averageCosts.get(item);
            System.out.println(item + ": R$" + averageCost);
        }
    }
}
