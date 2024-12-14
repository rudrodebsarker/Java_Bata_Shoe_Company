package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;

public class WorkShiftController {

    @FXML
    private TextField EmployeeID;

    @FXML
    private javafx.scene.control.DatePicker DatePicker;
    @FXML
    private Button AnnouncementsButton;

    @FXML
    private SplitMenuButton ApplicationCenterMenu;

    @FXML
    private Button ExpenseClaimButton;

    @FXML
    private Button PayrollButton;

    @FXML
    private Button SignOutButton;

    @FXML
    private Button UserCenterButton;

    @FXML
    private AnchorPane WelcomeNote;

    @FXML
    private TableView<WorkShift> WorkShiftTable;

    @FXML
    private TableColumn<WorkShift, String> Column1;

    @FXML
    private TableColumn<WorkShift, String> Column2;
    @FXML
    private LocalDate date;

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
    void ShowUserCenterOnButtonClick(ActionEvent event) {

    }

    @FXML
    void SignOutOnButtonClick(ActionEvent event) {

    }
    private void initialize() {
        Column1.setCellValueFactory(new PropertyValueFactory<WorkShift, String>("Employee Name"));
        Column2.setCellValueFactory(new PropertyValueFactory<WorkShift, String>("Employee ID"));

        DatePicker.setOnAction(event -> loadWorkShift(DatePicker.getValue()));
    }
    private void loadWorkShift(LocalDate workShift) {
        ObservableList<WorkShift> workShiftData = FXCollections.observableArrayList(
                new WorkShift("1910031", date),
                new WorkShift("1830581", date)
        );

    }

}
