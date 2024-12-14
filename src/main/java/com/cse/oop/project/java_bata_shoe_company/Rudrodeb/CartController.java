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

public class CartController
{
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> moselTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> priceTableColumn;
    @javafx.fxml.FXML
    private Label showTotalAmountLabel;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> availabilityTableColumn;
    @javafx.fxml.FXML
    private TableView<ShoeModel> tableView;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> productCodeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> sizeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> quentityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> brandTableColumn;


    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void loadAddedItemsOnButtonClick(ActionEvent actionEvent) {
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
    public void closeWindowOnClick(Event event) {
    }

    @javafx.fxml.FXML
    public void showTotalAmountOnButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmOrderOnButtonClick(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void switchToShoeModelOnButtonClick(ActionEvent actionEvent) {
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