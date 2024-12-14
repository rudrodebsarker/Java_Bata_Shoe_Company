package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import javafx.scene.control.DatePicker;

import java.time.LocalDate;

public class LeaveApplication {
    private String EmployeeName;
    private int EmployeeID;
    private DatePicker LeaveDate;
    private String LeaveType;
    private String LeaveReason;
    public LeaveApplication(String EmployeeName, int EmployeeID, String LeaveType, String LeaveReason) {
        this.EmployeeName = EmployeeName;
        this.EmployeeID = EmployeeID;
        this.LeaveType = LeaveType;
        this.LeaveReason = LeaveReason;
    }

    public LeaveApplication(String employeeName, String employeeID, LocalDate value, String leaveTypeField, String leaveReason) {
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
    public DatePicker getLeaveDate() {
        return LeaveDate;
    }
    public void setLeaveDate(DatePicker LeaveDate) {
        this.LeaveDate = LeaveDate;
    }
    public String getLeaveType() {
        return LeaveType;
    }
    public void setLeaveType(String LeaveType) {
        this.LeaveType = LeaveType;
    }
    public String getLeaveReason() {
        return LeaveReason;
    }
    public void setLeaveReason(String LeaveReason) {
        this.LeaveReason = LeaveReason;
    }

}
