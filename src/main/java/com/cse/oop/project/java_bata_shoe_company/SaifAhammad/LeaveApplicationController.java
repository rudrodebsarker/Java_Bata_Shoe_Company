package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class LeaveApplicationController {

    public TextArea LeaveReason;
    @FXML
    private Button AnnouncementsButton;

    @FXML
    private TextField EmployeeID;

    @FXML
    private TextField EmployeeName;

    @FXML
    private Button ExpenseClaimButton;

    @FXML
    private DatePicker LeaveDate;

    @FXML
    private TextField LeaveType;

    @FXML
    private Button PayrollButton;

    @FXML
    private Button SignOutButton;

    @FXML
    private Button SubmitApplicationButton;

    @FXML
    private Button UserCenterButton;

    @FXML
    private AnchorPane WelcomeNote;

    @FXML
    private Button WorkShiftButton;

    @FXML
    void ShowAnnouncementsOnButtonClick(ActionEvent event) {

    }


    @FXML
    void ShowExpenseClaimPageOnButtonClick(ActionEvent event) {

    }

    @FXML
    void ShowPayrollOnButtonClick(ActionEvent event) {

    }

    @FXML
    void ShowUserCenterOnButtonClick(ActionEvent event) {

    }

    @FXML
    void ShowWorkShiftOnButtonClick(ActionEvent event) {

    }

    @FXML
    void SignOutOnButtonClick(ActionEvent event) {

    }

    @FXML
    private void SubmitApplicationOnButtonClick(ActionEvent event) {
        String name = EmployeeName.getText();
        String id = EmployeeID.getText();
        String leaveType = LeaveType.getText();
        String leaveReason = LeaveReason.getText();
        String date = LeaveDate.getValue() != null ? LeaveDate.getValue().toString() : "";

        if(name.isEmpty() || id.isEmpty() || leaveType.isEmpty() || leaveReason.isEmpty() || date.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all the fields");
            alert.showAndWait();
        }
        LeaveApplication leaveApplication = new LeaveApplication(name,id,LeaveDate.getValue(),leaveReason,leaveType);
        System.out.println("Leave Application Submitted" + leaveApplication);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Submission Successful!");
        alert.setHeaderText(null);
        alert.setContentText("Your leave application has been submitted successfully.");
        alert.showAndWait();
    }

}
