package com.cse.oop.project.java_bata_shoe_company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.Optional;

public class OptimizeProductionController {

    @FXML
    private TextField dailyProductionRateTextField;

    @FXML
    private CheckBox performanceIssueCheckBox;

    @FXML
    private TextField resourceUseTextField;

    @FXML
    private Label efficiencyLabel;

    @FXML
    private TextField wasteGeneratedTextField;

    @FXML
    private TextField targetWasteTextField;

    @FXML
    private Button calculateWasteButton;

    @FXML
    private Label wasteEfficiencyLabel;

    @FXML
    private Button scheduleMaintenanceButton;

    @FXML
    private Label alertsLabel;

    private static final float DAILY_PRODUCTION_TARGET = 1000.0f; // Example production target
    private static final float TARGET_WASTE_RATIO = 10.0f; // Example waste target ratio

    @FXML
    void calculateEfficiency() {
        try {
            float productionRate = Float.parseFloat(dailyProductionRateTextField.getText());
            float efficiency = (productionRate / DAILY_PRODUCTION_TARGET) * 100;
            efficiencyLabel.setText(String.format("%.2f%%", efficiency));

            if (efficiency < 80) {
                performanceIssueCheckBox.setSelected(true);
                alertsLabel.setText("Performance issue detected. Please address it.");
            } else {
                performanceIssueCheckBox.setSelected(false);
                alertsLabel.setText("Production efficiency is on track.");
            }
        } catch (NumberFormatException e) {
            efficiencyLabel.setText("Invalid input for production rate.");
        }
    }

    @FXML
    void calculateWasteEfficiency() {
        try {
            float wasteGenerated = Float.parseFloat(wasteGeneratedTextField.getText());
            float targetWaste = Float.parseFloat(targetWasteTextField.getText());
            float wasteEfficiency = ((targetWaste - wasteGenerated) / targetWaste) * 100;
            wasteEfficiencyLabel.setText(String.format("%.2f%%", wasteEfficiency));

            if (wasteGenerated > targetWaste) {
                alertsLabel.setText("Waste target exceeded. Please review operations.");
            } else {
                alertsLabel.setText("Waste efficiency is on track.");
            }
        } catch (NumberFormatException e) {
            wasteEfficiencyLabel.setText("Invalid input for waste generated or target.");
        }
    }

    @FXML
    void scheduleMaintenance() {
        if (performanceIssueCheckBox.isSelected()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Maintenance Scheduled");
            alert.setHeaderText("Routine Maintenance Scheduled");
            alert.setContentText("Maintenance is scheduled to prevent downtime.");
            alert.showAndWait();
        } else {
            alertsLabel.setText("No maintenance required at this time.");
        }
    }

    @FXML
    public void calculateEfficiencyButton(ActionEvent actionEvent) {
    }
}
