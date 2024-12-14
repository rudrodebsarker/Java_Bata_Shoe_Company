package com.cse.oop.project.java_bata_shoe_company;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.Map;
import com.cse.oop.project.java_bata_shoe_company.ProductionOutput;

public class ProductionOutputController {

    @FXML
    private TextField shift1Field;
    @FXML
    private TextField shift2Field;
    @FXML
    private TextField shift3Field;
    @FXML
    private TextField shift4Field;
    @FXML
    private Label dailyOutputLabel;
    @FXML
    private Label targetFeedbackLabel;
    @FXML
    private VBox hourlyRatesVBox;

    private ProductionOutput productionOutput;
    private final double dailyTarget = 1000.0; // Example daily production target

    @FXML
    public void initialize() {
        productionOutput = new ProductionOutput(dailyTarget);
    }

    @FXML
    public void handleSubmit() {
        try {
            double shift1Output = Double.parseDouble(shift1Field.getText().trim());
            double shift2Output = Double.parseDouble(shift2Field.getText().trim());
            double shift3Output = Double.parseDouble(shift3Field.getText().trim());
            double shift4Output = Double.parseDouble(shift4Field.getText().trim());

            productionOutput.recordProduction("Shift 1", shift1Output);
            productionOutput.recordProduction("Shift 2", shift2Output);
            productionOutput.recordProduction("Shift 3", shift3Output);
            productionOutput.recordProduction("Shift 4", shift4Output);

            double totalOutput = productionOutput.getDailyTotalOutput();
            dailyOutputLabel.setText("Total Daily Output: " + totalOutput);
            targetFeedbackLabel.setText("Daily Target Met: " + (productionOutput.didMeetDailyTargets() ? "Yes" : "No"));

            displayHourlyRates(productionOutput.getHourlyProductionRates());

        } catch (NumberFormatException e) {
            // Handle invalid input
            targetFeedbackLabel.setText("Please enter valid production outputs.");
        }
    }

    private void displayHourlyRates(Map<String, Double> hourlyRates) {
        hourlyRatesVBox.getChildren().clear();  // Clear previous hourly rate labels
        hourlyRates.forEach((shift, rate) -> {
            hourlyRatesVBox.getChildren().add(new Label(shift + " Hourly Rate: " + rate));
        });
    }
}
