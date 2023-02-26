package org.example.seeds;

import org.example.models.InventoryCost;

import java.util.ArrayList;
import java.util.List;

public class InventoryCostSeeder {
    public List<InventoryCost> seeds() {
        List<InventoryCost> inventoryCosts = new ArrayList<>();
        inventoryCosts.add(new InventoryCost("Memory 64Gb", 10, 10.00));
        inventoryCosts.add(new InventoryCost("Memory 64Gb", 50, 15.00));
        inventoryCosts.add(new InventoryCost("Chipset RX2321", 20, 20.00));
        inventoryCosts.add(new InventoryCost("Chipset RX2321", 80, 25.00));
        inventoryCosts.add(new InventoryCost("Display DS21344", 100, 12.00));

        return inventoryCosts;
    }
}
