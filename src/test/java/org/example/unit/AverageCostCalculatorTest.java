package org.example.unit;

import org.example.models.InventoryCost;
import org.example.service.AverageCostCalculatorService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AverageCostCalculatorTest {
    @Test
    public void testCalculate(){
        List<InventoryCost> inventoryCosts = new ArrayList<>();
        inventoryCosts.add(new InventoryCost("Memory 64Gb", 10, 10.00));
        inventoryCosts.add(new InventoryCost("Chipset RX2321", 20, 20.00));
        inventoryCosts.add(new InventoryCost("Memory 64Gb", 50, 15.00));
        inventoryCosts.add(new InventoryCost("Display DS21344", 100, 12.00));
        inventoryCosts.add(new InventoryCost("Chipset RX2321", 80, 25.00));

        Map<String, Double> averageCosts = AverageCostCalculatorService.calculate(inventoryCosts);

        Assertions.assertFalse(averageCosts.isEmpty());
        Assertions.assertEquals(averageCosts.size(), 3);

        Assertions.assertEquals(14.166666666666666, averageCosts.get("Memory 64Gb"), 0.0001);
        Assertions.assertEquals(24.0, averageCosts.get("Chipset RX2321"), 0.0001);
        Assertions.assertEquals(12.0, averageCosts.get("Display DS21344"), 0.0001);
    }


}
