package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

public class ShoeModel {
    private String brand, shoe_model, code, availability, size;
    private Float price;

    public ShoeModel() {
    }

    public ShoeModel(String brand, String shoe_model, String code, String availability, String size, Float price) {
        this.brand = brand;
        this.shoe_model = shoe_model;
        this.code = code;
        this.availability = availability;
        this.size = size;
        this.price = price;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getShoe_model() {
        return shoe_model;
    }

    public void setShoe_model(String shoe_model) {
        this.shoe_model = shoe_model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "ShoeModel{" +
                "brand='" + brand + '\'' +
                ", shoe_model='" + shoe_model + '\'' +
                ", code='" + code + '\'' +
                ", availability='" + availability + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }


    public String toString(String reason) {
        return code+","+brand+","+shoe_model+","+availability+","+size+","+price+"\n";
    }

}
