package com.cse.oop.project.java_bata_shoe_company;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CEOController {

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMonitorSales(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("monitorSales.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToOptimizeProduction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("optimizeProduction.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEnsureQuality(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ensureQualityControl.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToEvaluateInvestmentOpportunities(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("evaluateInvestmentOpportunities.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToStrategicExpansion(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("strategicExpansion.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToFinancialOversight(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("financialOversight.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void handleOptimizeProduction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleStrategicExpansion(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleMonitorSales(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleEvaluateInvestment(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleEnsureQuality(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleFinancialOversight(ActionEvent actionEvent) {
    }
}
