package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

public class SubmitReview {
    private String shoe_model, customer_feedback, code, brand;

    public SubmitReview() {
    }

    public SubmitReview(String shoe_model, String customer_feedback, String code, String brand) {
        this.shoe_model = shoe_model;
        this.customer_feedback = customer_feedback;
        this.code = code;
        this.brand = brand;
    }


    public String getShoe_model() {
        return shoe_model;
    }

    public void setShoe_model(String shoe_model) {
        this.shoe_model = shoe_model;
    }

    public String getCustomer_feedback() {
        return customer_feedback;
    }

    public void setCustomer_feedback(String customer_feedback) {
        this.customer_feedback = customer_feedback;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "SubmitReview{" +
                "shoe_model='" + shoe_model + '\'' +
                ", customer_feedback='" + customer_feedback + '\'' +
                ", code='" + code + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
