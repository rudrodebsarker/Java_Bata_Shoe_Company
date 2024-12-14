package com.cse.oop.project.java_bata_shoe_company;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

public class CEOModel {

    private DoubleProperty totalSales;
    private DoubleProperty productionEfficiency;
    private DoubleProperty qualityControlRate;
    private DoubleProperty investmentOpportunities;
    private DoubleProperty expansionOpportunities;
    private DoubleProperty financialOversightAccuracy;


    public CEOModel() {
        this.totalSales = new SimpleDoubleProperty(0.0);
        this.productionEfficiency = new SimpleDoubleProperty(0.0);
        this.qualityControlRate = new SimpleDoubleProperty(0.0);
        this.investmentOpportunities = new SimpleDoubleProperty(0.0);
        this.expansionOpportunities = new SimpleDoubleProperty(0.0);
        this.financialOversightAccuracy = new SimpleDoubleProperty(0.0);
    }

    public double getTotalSales() {
        return totalSales.get();
    }

    public void setTotalSales(double totalSales) {
        this.totalSales.set(totalSales);
    }

    public DoubleProperty totalSalesProperty() {
        return totalSales;
    }


    public double getProductionEfficiency() {
        return productionEfficiency.get();
    }

    public void setProductionEfficiency(double productionEfficiency) {
        this.productionEfficiency.set(productionEfficiency);
    }

    public DoubleProperty productionEfficiencyProperty() {
        return productionEfficiency;
    }


    public double getQualityControlRate() {
        return qualityControlRate.get();
    }

    public void setQualityControlRate(double qualityControlRate) {
        this.qualityControlRate.set(qualityControlRate);
    }

    public DoubleProperty qualityControlRateProperty() {
        return qualityControlRate;
    }


    public double getInvestmentOpportunities() {
        return investmentOpportunities.get();
    }

    public void setInvestmentOpportunities(double investmentOpportunities) {
        this.investmentOpportunities.set(investmentOpportunities);
    }

    public DoubleProperty investmentOpportunitiesProperty() {
        return investmentOpportunities;
    }


    public double getExpansionOpportunities() {
        return expansionOpportunities.get();
    }

    public void setExpansionOpportunities(double expansionOpportunities) {
        this.expansionOpportunities.set(expansionOpportunities);
    }

    public DoubleProperty expansionOpportunitiesProperty() {
        return expansionOpportunities;
    }

    public double getFinancialOversightAccuracy() {
        return financialOversightAccuracy.get();
    }

    public void setFinancialOversightAccuracy(double financialOversightAccuracy) {
        this.financialOversightAccuracy.set(financialOversightAccuracy);
    }

    public DoubleProperty financialOversightAccuracyProperty() {
        return financialOversightAccuracy;
    }
}
