package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

public class PurchaseOrders {
    private int id;
    private String description;
    private double price;
    private int quantity;

    public PurchaseOrders(int id, String description, double price, int quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;

    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
