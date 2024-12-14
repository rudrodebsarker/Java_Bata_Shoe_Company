package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import com.cse.oop.project.java_bata_shoe_company.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplierDashboardController {

    @FXML
    private Button DeliveryButton;

    @FXML
    private Button PurchaseOrdersButton;

    @FXML
    private Button ShipmentButton;

    @FXML
    private Button SignOutButton;

    @FXML
    private Button SubmitInvoicesButton;

    @FXML
    private Button Performancemetricsbutton;

    @FXML
    private Button SupplierButton;

    @FXML
    private Label SupplierDashboard;

    @FXML
    private Button TransportationTeamButton;

    @FXML
    private Button WarehouseButton;

    @FXML
    void ShowDeliveryOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("QueuedDelivery.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Queued Delivery");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowPurchaseOrdersOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PurchaseOrders.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Purchase Orders");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowShipmentOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ShipmentRequest.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Shipment Request");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowSubmitInvoicesOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SubmitInvoices.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Submit Invoices");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowSupplierOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UpdateSupplierInfo.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Update Supplier Info");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowTransportationTeamOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TransportationTeam.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Transport Team");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowWarehouseOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Warehouse.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Warehouse");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }
    @FXML
    void ShowPerformanceMetricsOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PerformanceMetrics.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Performance Metrics");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void SignOutOnButtonClick(ActionEvent event) {


    }

}
