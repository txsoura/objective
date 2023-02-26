package org.example.models;

public class InventoryCost {
    public String item;
    public Integer quantity;
    public Double cost;

    public InventoryCost(String item, Integer quantity, Double cost) {
        this.item = item;
        this.quantity = quantity;
        this.cost = cost;
    }
}
