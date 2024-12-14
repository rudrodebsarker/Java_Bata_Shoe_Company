package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

public class AccessPromotion {
    private String model, discount_info, validity_period, brand;

    public AccessPromotion() {
    }

    public AccessPromotion(String model, String discount_info, String validity_period, String brand) {
        this.model = model;
        this.discount_info = discount_info;
        this.validity_period = validity_period;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDiscount_info() {
        return discount_info;
    }

    public void setDiscount_info(String discount_info) {
        this.discount_info = discount_info;
    }

    public String getValidity_period() {
        return validity_period;
    }

    public void setValidity_period(String validity_period) {
        this.validity_period = validity_period;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "AccessPromotion{" +
                "model='" + model + '\'' +
                ", discount_info='" + discount_info + '\'' +
                ", validity_period='" + validity_period + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }


    public String toString(String reason) {
        return model+","+discount_info+","+validity_period+","+brand+"\n";
    }

}
