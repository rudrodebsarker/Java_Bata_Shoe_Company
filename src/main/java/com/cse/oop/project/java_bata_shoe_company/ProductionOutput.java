package com.cse.oop.project.java_bata_shoe_company;

import java.util.HashMap;
import java.util.Map;

public class ProductionOutput {

    private final Map<String, Double> productionData; // Stores production data for each shift
    private final double dailyTarget;                // Daily production target

    public ProductionOutput(double dailyTarget) {
        this.dailyTarget = dailyTarget;
        this.productionData = new HashMap<>();
    }

    // Records production for a specific shift
    public void recordProduction(String shift, double output) {
        if (output < 0) {
            throw new IllegalArgumentException("Production output cannot be negative.");
        }
        productionData.put(shift, output);
    }

    // Calculates the total daily output
    public double getDailyTotalOutput() {
        return productionData.values().stream().mapToDouble(Double::doubleValue).sum();
    }

    // Checks if the daily target is met
    public boolean didMeetDailyTargets() {
        return getDailyTotalOutput() >= dailyTarget;
    }

    // Calculates hourly production rates for each shift (assuming an 8-hour shift)
    public Map<String, Double> getHourlyProductionRates() {
        Map<String, Double> hourlyRates = new HashMap<>();
        productionData.forEach((shift, output) -> hourlyRates.put(shift, output / 8));
        return hourlyRates;
    }

    // Getters and setters (if required)
    public Map<String, Double> getProductionData() {
        return productionData;
    }

    public double getDailyTarget() {
        return dailyTarget;
    }

    @Override
    public String toString() {
        return "ProductionOutput{" +
                "productionData=" + productionData +
                ", dailyTarget=" + dailyTarget +
                '}';
    }
}
