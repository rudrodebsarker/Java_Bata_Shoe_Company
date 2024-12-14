package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

public class TransportationTeam {
    private String name;
    private int capacity;
    public TransportationTeam(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
