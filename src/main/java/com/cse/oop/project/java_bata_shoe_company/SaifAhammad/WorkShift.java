package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import java.time.LocalDate;

public class WorkShift {
    private String EmployeeID;
    private LocalDate ShiftDate;

    public WorkShift(String employeeID, LocalDate shiftDate) {
        EmployeeID = employeeID;
        ShiftDate = shiftDate;
    }
    public String getEmployeeID() {
        return EmployeeID;

    }
    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;

    }
    public LocalDate getShiftDate() {
        return ShiftDate;
    }
    public void setShiftDate(LocalDate shiftDate) {
        ShiftDate = shiftDate;

    }

}