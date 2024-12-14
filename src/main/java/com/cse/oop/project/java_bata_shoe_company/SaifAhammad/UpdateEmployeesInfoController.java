package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class UpdateEmployeesInfoController {

    @FXML
    private Button AnnouncementsButton;

    @FXML
    private SplitMenuButton ApplicationCenterMenu;

    @FXML
    private TextField EmployeeAddress;

    @FXML
    private TextField EmployeeContactNo;

    @FXML
    private TextField EmployeeEmail;

    @FXML
    private TextField EmployeeID;

    @FXML
    private TextField EmployeeName;

    @FXML
    private Button ExpenseClaimButton;

    @FXML
    private Button PayrollButton;

    @FXML
    private Button SignOutButton;

    @FXML
    private Button SubmitUpdateButton;

    @FXML
    private AnchorPane WelcomeNote;

    @FXML
    private Button WorkShiftButton;

    @FXML
    void ShowAnnouncementsOnButtonClick(ActionEvent event) {

    }

    @FXML
    void ShowApplicationMenuOnClick(ActionEvent event) {

    }

    @FXML
    void ShowExpenseClaimPageOnButtonClick(ActionEvent event) {

    }

    @FXML
    void ShowPayrollOnButtonClick(ActionEvent event) {

    }

    @FXML
    void ShowWorkShiftOnButtonClick(ActionEvent event) {

    }

    @FXML
    void SignOutOnButtonClick(ActionEvent event) {

    }

    @FXML
    void SubmitUpdateOnClick(ActionEvent event) {
        String name = EmployeeName.getText();
        String address = EmployeeAddress.getText();
        String contactNo = EmployeeContactNo.getText();
        String email = EmployeeEmail.getText();
        String id = EmployeeID.getText();

        if (name.isEmpty() || id.isEmpty() || contactNo.isEmpty() || address.isEmpty() || email.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Form Error!", "Please fill in all fields.");
            return;
        }
        Employee employee = new Employee(name, id, contactNo, address, email);
        System.out.println("Employee Information Updated: " + employee);
        showAlert(Alert.AlertType.INFORMATION, "Update Successful!", "Employee information has been updated successfully.");
        clearForm();
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void clearForm() {
        EmployeeID.clear();
        EmployeeName.clear();
        EmployeeAddress.clear();
        EmployeeContactNo.clear();
        EmployeeEmail.clear();
        EmployeeID.clear();
        EmployeeName.clear();
    }

    private static class Employee {
        public Employee(String name, String id, String contactNo, String address, String email) {
        }
    }
}
