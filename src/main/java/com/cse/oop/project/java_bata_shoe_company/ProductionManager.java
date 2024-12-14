package com.cse.oop.project.java_bata_shoe_company;

public class ProductionManager {
    private String managerName;
    private int managerId;

    // Constructor
    public ProductionManager(String managerName, int managerId) {
        this.managerName = managerName;
        this.managerId = managerId;
    }

    // Getters and Setters
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    @Override
    public String toString() {
        return "ProductionManager{" +
                "managerName='" + managerName + '\'' +
                ", managerId=" + managerId +
                '}';
    }
}
