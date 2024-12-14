package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

public class CheckApplicationStatus {
    private String ApplicationID;
    private String status;

    public CheckApplicationStatus(String applicationID, String status) {
        ApplicationID = applicationID;
        this.status = status;
    }
    public String getApplicationID() {
        return ApplicationID;
    }
    public void setApplicationID(String applicationID) {
        ApplicationID = applicationID;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
