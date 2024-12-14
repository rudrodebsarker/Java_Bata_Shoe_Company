package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

public class EmployeesDashboard {
    private String EmployeeName;
    private int EmployeeID;

    public EmployeesDashboard(String employeeName, int employeeID) {
        EmployeeName = employeeName;
        EmployeeID = employeeID;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
        EmployeeID = employeeID;
    }

}
