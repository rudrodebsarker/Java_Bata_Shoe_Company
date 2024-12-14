package com.cse.oop.project.java_bata_shoe_company;

public class OptimizeProduction {

    private float dailyProductionRate;
    private boolean performanceIssueDetected;
    private float resourceUse;
    private float wasteGenerated;
    private float targetWaste;
    private float efficiency;
    private float wasteEfficiency;

    // Constructor
    public OptimizeProduction(float dailyProductionRate, float resourceUse, float wasteGenerated, float targetWaste) {
        this.dailyProductionRate = dailyProductionRate;
        this.resourceUse = resourceUse;
        this.wasteGenerated = wasteGenerated;
        this.targetWaste = targetWaste;
        calculateEfficiency();
        calculateWasteEfficiency();
    }


    public float getDailyProductionRate() {
        return dailyProductionRate;
    }

    public void setDailyProductionRate(float dailyProductionRate) {
        this.dailyProductionRate = dailyProductionRate;
        calculateEfficiency();
    }

    public boolean isPerformanceIssueDetected() {
        return performanceIssueDetected;
    }

    public void setPerformanceIssueDetected(boolean performanceIssueDetected) {
        this.performanceIssueDetected = performanceIssueDetected;
    }

    public float getResourceUse() {
        return resourceUse;
    }

    public void setResourceUse(float resourceUse) {
        this.resourceUse = resourceUse;
    }

    public float getWasteGenerated() {
        return wasteGenerated;
    }

    public void setWasteGenerated(float wasteGenerated) {
        this.wasteGenerated = wasteGenerated;
        calculateWasteEfficiency();
    }

    public float getTargetWaste() {
        return targetWaste;
    }

    public void setTargetWaste(float targetWaste) {
        this.targetWaste = targetWaste;
        calculateWasteEfficiency();
    }

    public float getEfficiency() {
        return efficiency;
    }

    public float getWasteEfficiency() {
        return wasteEfficiency;
    }


    private void calculateEfficiency() {
        this.efficiency = (dailyProductionRate / 1000.0f) * 100; // Use explicit value instead of private field
        this.performanceIssueDetected = efficiency < 80; // Assuming 80% as the threshold
    }


    private void calculateWasteEfficiency() {
        this.wasteEfficiency = ((targetWaste - wasteGenerated) / targetWaste) * 100;
    }

    @Override
    public String toString() {
        return "ProductionModel{" +
                "dailyProductionRate=" + dailyProductionRate +
                ", performanceIssueDetected=" + performanceIssueDetected +
                ", resourceUse=" + resourceUse +
                ", wasteGenerated=" + wasteGenerated +
                ", targetWaste=" + targetWaste +
                ", efficiency=" + efficiency +
                ", wasteEfficiency=" + wasteEfficiency +
                '}';
    }
}
