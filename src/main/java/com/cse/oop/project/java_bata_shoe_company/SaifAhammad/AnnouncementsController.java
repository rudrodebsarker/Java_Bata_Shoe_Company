package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.AnchorPane;

public class AnnouncementsController {

    @FXML
    private ListView<String> AnnouncementList;

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
    private Button WorkShiftButton;

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
    void ShowWorkShiftOnButtonClick(ActionEvent event) {

    }

    @FXML
    void SignOutOnButtonClick(ActionEvent event) {

    }
    @FXML
    private void initialize()
    {
        ObservableList<String> announcements = FXCollections.observableArrayList(
                "Meeting at 10AM",
                "Lunch Break at 12PM",
                "Team Building Activity at 3PM"
        );
        AnnouncementList.setItems(announcements);
    }

}
