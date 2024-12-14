package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

public class SupplierDashboard {
    private String supplierName;
    private String supplierAddress;
    private String supplierContact;
    private String supplierEmail;

    public SupplierDashboard(String supplierName, String supplierAddress, String supplierContact, String supplierEmail) {
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
        this.supplierContact = supplierContact;
        this.supplierEmail = supplierEmail;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public String getSupplierAddress() {
        return supplierAddress;
    }
    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }
    public String getSupplierContact() {
        return supplierContact;
    }
    public void setSupplierContact(String supplierContact) {
        this.supplierContact = supplierContact;
    }
    public String getSupplierEmail() {
        return supplierEmail;
    }
    public void setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
    }

}
