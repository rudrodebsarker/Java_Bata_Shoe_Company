package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

public class ManageEmployee {
    private String employeeID, employeeName, jobRoles, contactDetails, additionalInfo;

    public ManageEmployee() {
    }

    public ManageEmployee(String employeeID, String employeeName, String jobRoles, String contactDetails, String additionalInfo) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.jobRoles = jobRoles;
        this.contactDetails = contactDetails;
        this.additionalInfo = additionalInfo;
    }


    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getJobRoles() {
        return jobRoles;
    }

    public void setJobRoles(String jobRoles) {
        this.jobRoles = jobRoles;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }


    @Override
    public String toString() {
        return "ManageEmployee{" +
                "employeeID='" + employeeID + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", jobRoles='" + jobRoles + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                '}';
    }


    public String toString(String reason) {
        return employeeID+","+employeeName+","+jobRoles+","+contactDetails+","+additionalInfo+"\n";
    }

}
