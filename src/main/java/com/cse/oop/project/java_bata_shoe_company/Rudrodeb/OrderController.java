package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import com.cse.oop.project.java_bata_shoe_company.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class OrderController
{
    @javafx.fxml.FXML
    private TableColumn moselTableColumn;
    @javafx.fxml.FXML
    private TableColumn priceTableColumn;
    @javafx.fxml.FXML
    private TableColumn availabilityTableColumn;
    @javafx.fxml.FXML
    private Label showTotalPayableAmountLabel;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn productCodeTableColumn;
    @javafx.fxml.FXML
    private TableColumn sizeTableColumn;
    @javafx.fxml.FXML
    private TableColumn quentityTableColumn;
    @javafx.fxml.FXML
    private TableColumn brandTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleLogoutOnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage refToCurrentStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setTitle("......");
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        }
        catch(Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void trackOrderOnButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void closeWindowOnClick(Event event) {
    }

    @javafx.fxml.FXML
    public void switchToDashboardButtonOnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("customar_dashboard.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage refToCurrentStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setTitle("......");
            refToCurrentStage.setScene(nextScene);
            refToCurrentStage.show();
        }
        catch(Exception e){
            //
        }
    }
}