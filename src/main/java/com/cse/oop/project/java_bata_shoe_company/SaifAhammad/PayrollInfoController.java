package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class PayrollInfoController {


    @FXML
    private Button AnnouncementsButton;

    @FXML
    private SplitMenuButton ApplicationCenterMenu;

    @FXML
    private Button ExpenseClaimButton;

    @FXML
    private TableView<PayrollInfo> PayrollInfoTable;

    @FXML
    private TableColumn Column1;
    @FXML
    private TableColumn Column2;

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
    void ShowExpenseClaimPageOnButtonClick(ActionEvent event) {

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
    public void initialize() {
        Column1.setCellValueFactory(new PropertyValueFactory<>("Column1"));
        Column2.setCellValueFactory(new PropertyValueFactory<>("Column2"));
        ObservableList<PayrollInfo> payrollData = FXCollections.observableArrayList(
                new PayrollInfo("Asif Ahmed", "5000"),
                new PayrollInfo("Jahangir Hasan", "4500"),
                new PayrollInfo("Jahangir Khan", "3500"),
                new PayrollInfo("Akash Ahmed", "7000")
        );
        PayrollInfoTable.setItems(payrollData);
    }

}
