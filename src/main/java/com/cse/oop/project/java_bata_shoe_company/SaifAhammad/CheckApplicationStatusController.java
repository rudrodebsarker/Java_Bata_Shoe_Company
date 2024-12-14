package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CheckApplicationStatusController {


    @FXML
    private Button AnnouncementsButton;

    @FXML
    private TableView<CheckApplicationStatus> ApplicationStatusTable;
    @FXML
    public TableColumn<CheckApplicationStatus, String> ApplicationIDColumn;
    @FXML
    public TableColumn<CheckApplicationStatus, String> StatusColumn;

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
    private void initialize() {
        ApplicationIDColumn.setCellValueFactory(new PropertyValueFactory<>("ApplicationID"));
        StatusColumn.setCellValueFactory(new PropertyValueFactory<>("Status"));

        ObservableList<CheckApplicationStatus> applicationStatuses = FXCollections.observableArrayList(
                new CheckApplicationStatus("APP001", "Pending"),
                new CheckApplicationStatus("APP002", "Accepted"),
                new CheckApplicationStatus("APP003", "Rejected")

        );
        ApplicationStatusTable.setItems(applicationStatuses);
    }
}

