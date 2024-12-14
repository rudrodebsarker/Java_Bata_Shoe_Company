package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class SubmitExpensesController {

    @FXML
    public Button ExpenseClaimButton;
    @FXML
    private Button AnnouncementsButton;

    @FXML
    private SplitMenuButton ApplicationCenterMenu;

    @FXML
    private TextField ExpenseAmountField;

    @FXML
    private DatePicker ExpenseDatePicker;

    @FXML
    private TextField ExpenseTitleField;

    @FXML
    private Button PayrollButton;

    @FXML
    private Button SignOutButton;

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
    void ShowApplicationMenuOnClick(ActionEvent event) {

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
    void SubmitExpenseClaimOnButtonClick(ActionEvent event) {
        String title = ExpenseTitleField.getText();
        String amount = ExpenseAmountField.getText();
        String date = ExpenseDatePicker.getValue() != null ? ExpenseDatePicker.getValue().toString() : "";

        if (title.isEmpty() || amount.isEmpty() || date.isEmpty()){
            showAlert(Alert.AlertType.ERROR, "Form Error!", "Please fill in all fields.");
            return;
        }
        ExpenseClaim expenseClaim = new ExpenseClaim(title, amount, date);
        System.out.println("Expense Claim Submitted: " + expenseClaim);
        showAlert(Alert.AlertType.INFORMATION, "Submission Successful!", "Your expense claim has been submitted successfully.");
        clearForm();

    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert;
        alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
    private void clearForm() {
        ExpenseAmountField.clear();
        ExpenseAmountField.clear();
        ExpenseDatePicker.setValue(null);
    }

    private class ExpenseClaim {
        public ExpenseClaim(String title, String amount, String date) {
        }
    }
}
