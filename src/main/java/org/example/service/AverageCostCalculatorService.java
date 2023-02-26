package org.example.service;

import org.example.models.InventoryCost;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AverageCostCalculatorService {
    public static Map<String, Double> calculate(List<InventoryCost> inventoryCosts) {
        Map<String, Double> averageCosts = new HashMap<>();
        Map<String, Double> totalAmounts = new HashMap<>();
        Map<String, Double> totalCosts = new HashMap<>();

        for (InventoryCost inventoryCost : inventoryCosts) {
            String item = inventoryCost.item;
            double quantity = (double) inventoryCost.quantity;
            double cost = inventoryCost.cost;

            if (!totalAmounts.containsKey(item)) {
                totalAmounts.put(item, 0.0);
                totalCosts.put(item, 0.0);
            }

            totalAmounts.put(item, totalAmounts.get(item) + quantity);
            totalCosts.put(item, totalCosts.get(item) + quantity * cost);
        }

        for (String item : totalAmounts.keySet()) {
            double totalAmount = totalAmounts.get(item);
            double totalCost = totalCosts.get(item);
            double averageCost = totalCost / totalAmount;
            averageCosts.put(item, averageCost);
        }

        return averageCosts;
    }
}
