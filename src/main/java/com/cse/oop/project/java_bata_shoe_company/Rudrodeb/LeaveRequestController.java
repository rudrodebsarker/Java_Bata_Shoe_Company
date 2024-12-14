package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LeaveRequestController
{
    @javafx.fxml.FXML
    private TableColumn reasonForLeaveTableColumn;
    @javafx.fxml.FXML
    private TextArea additionalCommentsTextField;
    @javafx.fxml.FXML
    private TableColumn additionalNotesTableColumn;
    @javafx.fxml.FXML
    private TextField employeeNameTextField;
    @javafx.fxml.FXML
    private TextField employeeIDTextField;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn leaveDatesTableColumn;
    @javafx.fxml.FXML
    private TableColumn employeeIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn employeeNameTableColumn;
    @javafx.fxml.FXML
    private TableColumn attachmentsTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rejectLeaveRequestOnButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveLeaveRequestOnButtonClick(ActionEvent actionEvent) {
    }
}