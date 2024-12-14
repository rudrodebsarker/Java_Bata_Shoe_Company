package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

public class Warehouse {
    private String ItemName;
    private int Quantity;

    public Warehouse(String itemName, int quantity) {
        ItemName = itemName;
        Quantity = quantity;
    }
    public String getItemName() {
        return ItemName;
    }
    public void setItemName(String itemName) {
        ItemName = itemName;
    }
    public int getQuantity() {
        return Quantity;
    }
    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

}
