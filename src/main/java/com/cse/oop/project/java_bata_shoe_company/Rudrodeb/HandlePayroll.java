package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import java.time.LocalDate;

public class HandlePayroll {
    private String employeeID;
    private double baseSalary, bonuses, deduction, totalSalary;
    private LocalDate DOB;


    public HandlePayroll(String token, double baseSalary, double bonuses, double deduction, double totalSalary, String s) {
    }

    public HandlePayroll(String employeeID, double baseSalary, double bonuses, double deduction, double totalSalary, LocalDate DOB) {
        this.employeeID = employeeID;
        this.baseSalary = baseSalary;
        this.bonuses = bonuses;
        this.deduction = deduction;
        this.totalSalary = totalSalary;
        this.DOB = DOB;
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonuses() {
        return bonuses;
    }

    public void setBonuses(double bonuses) {
        this.bonuses = bonuses;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }


    @Override
    public String toString() {
        return "HandlePayroll{" +
                "employeeID='" + employeeID + '\'' +
                ", baseSalary=" + baseSalary +
                ", bonuses=" + bonuses +
                ", deduction=" + deduction +
                ", totalSalary=" + totalSalary +
                ", DOB=" + DOB +
                '}';
    }


    public String toString(String reason) {
        return employeeID+","+baseSalary+","+bonuses+","+deduction+","+totalSalary+","+DOB+"\n";
    }


}
