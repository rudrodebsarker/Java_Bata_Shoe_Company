package com.cse.oop.project.java_bata_shoe_company;

public class MonitorSales {

    private String branchName;
    private String itemName;
    private String itemPrice;
    private String quantity;
    private String totalSales;
    private String dateOfSale;
    private String dailyTarget;


    public MonitorSales(String branchName, String itemName, String itemPrice, String quantity, String totalSales, String dateOfSale, String dailyTarget) {
        this.branchName = branchName;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
        this.totalSales = totalSales;
        this.dateOfSale = dateOfSale;
        this.dailyTarget = dailyTarget;
    }

    // Getters and Setters
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(String totalSales) {
        this.totalSales = totalSales;
    }

    public String getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(String dateOfSale) {
        this.dateOfSale = dateOfSale;
    }

    public String getDailyTarget() {
        return dailyTarget;
    }

    public void setDailyTarget(String dailyTarget) {
        this.dailyTarget = dailyTarget;
    }
}
