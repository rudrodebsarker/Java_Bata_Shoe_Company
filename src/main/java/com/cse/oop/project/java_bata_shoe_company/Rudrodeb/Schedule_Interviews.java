package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import java.time.LocalDate;

public class Schedule_Interviews {

    private String applicantID, canditateName, time, location, additional_info;
    LocalDate dob;



    public Schedule_Interviews(String applicantID, String canditateName, String time, String location, String additional_info, LocalDate dob) {
        this.applicantID = applicantID;
        this.canditateName = canditateName;
        this.time = time;
        this.location = location;
        this.additional_info = additional_info;
        this.dob = dob;
    }


    public String getApplicantID() {
        return applicantID;
    }

    public void setApplicantID(String applicantID) {
        this.applicantID = applicantID;
    }

    public String getCanditateName() {
        return canditateName;
    }

    public void setCanditateName(String canditateName) {
        this.canditateName = canditateName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }


    @Override
    public String toString() {
        return "Schedule_Interviews{" +
                "applicantID='" + applicantID + '\'' +
                ", canditateName='" + canditateName + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                ", additional_info='" + additional_info + '\'' +
                ", dob=" + dob +
                '}';
    }


    public String toString(String reason) {
        return applicantID+","+canditateName+","+time+","+location+","+additional_info+","+dob+"\n";
    }

}
