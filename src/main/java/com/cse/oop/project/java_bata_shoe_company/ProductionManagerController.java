package com.cse.oop.project.java_bata_shoe_company;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class ProductionManagerController {

    @FXML
    private Button overseeDailyProduction;

    @FXML
    private Button ensureQuality;

    @FXML
    private Button monitorInventoryLevels;

    @FXML
    private Button viewReports;

    @FXML
    private void initialize() {
        overseeDailyProduction.setOnAction(event -> switchScene("DailyProduction.fxml"));
        ensureQuality.setOnAction(event -> switchScene("QualityControl.fxml"));
        monitorInventoryLevels.setOnAction(event -> switchScene("InventoryMonitoring.fxml"));
        viewReports.setOnAction(event -> switchScene("Reports.fxml"));
    }

    private void switchScene(String fxmlFile) {
        try {
            Stage stage = (Stage) overseeDailyProduction.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Pane newRoot = loader.load();
            Scene newScene = new Scene(newRoot);
            stage.setScene(newScene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
