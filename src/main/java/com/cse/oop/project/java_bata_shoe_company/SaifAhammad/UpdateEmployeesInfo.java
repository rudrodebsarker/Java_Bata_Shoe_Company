package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

public class UpdateEmployeesInfo {
    private String EmployeeName;
    private int EmployeeID;
    private String Address;
    private String Email;

    public UpdateEmployeesInfo(String EmployeeName, int EmployeeID, String Address, String Email) {
        this.EmployeeName = EmployeeName;
        this.EmployeeID = EmployeeID;
        this.Address = Address;
        this.Email = Email;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }
    public int getEmployeeID() {
        return EmployeeID;
    }
    public void setEmployeeID(int EmployeeID) {
        this.EmployeeID = EmployeeID;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }

}
