package com.cse.oop.project.java_bata_shoe_company;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert.AlertType;
import java.time.LocalDate;

public class EnsureQualityControlController {

    @FXML
    private TextField productNameTextField;
    @FXML
    private DatePicker dateOfInspectionDatePicker;
    @FXML
    private TextArea inspectionResultsTextArea;
    @FXML
    private ComboBox<String> qualityStatusComboBox;
    @FXML
    private TableView<EnsureQuality> inspectionDataTableView;
    @FXML
    private TableColumn<EnsureQuality, LocalDate> inspectionDateTableColumn;
    @FXML
    private TableColumn<EnsureQuality, String> productNameTableColumn;
    @FXML
    private TableColumn<EnsureQuality, String> inspectionResultsTableColumn;
    @FXML
    private TableColumn<EnsureQuality, String> qualityStatusTableColumn;

    @FXML
    public void exitButtonOnMouseClick(ActionEvent actionEvent) {
    }

    /**
     * Represents a record for quality inspection.
     */
    public static class EnsureQuality {

        private final SimpleObjectProperty<LocalDate> inspectionDate;
        private final SimpleStringProperty productName;
        private final SimpleStringProperty inspectionResults;
        private final SimpleStringProperty qualityStatus;

        public EnsureQuality(LocalDate inspectionDate, String productName, String inspectionResults, String qualityStatus) {
            this.inspectionDate = new SimpleObjectProperty<>(inspectionDate);
            this.productName = new SimpleStringProperty(productName);
            this.inspectionResults = new SimpleStringProperty(inspectionResults);
            this.qualityStatus = new SimpleStringProperty(qualityStatus);
        }

        public ObjectProperty<LocalDate> inspectionDateProperty() {
            return inspectionDate;
        }

        public StringProperty productNameProperty() {
            return productName;
        }

        public StringProperty inspectionResultsProperty() {
            return inspectionResults;
        }

        public StringProperty qualityStatusProperty() {
            return qualityStatus;
        }

        public LocalDate getInspectionDate() {
            return inspectionDate.get();
        }

        public void setInspectionDate(LocalDate inspectionDate) {
            this.inspectionDate.set(inspectionDate);
        }

        public String getProductName() {
            return productName.get();
        }

        public void setProductName(String productName) {
            this.productName.set(productName);
        }

        public String getInspectionResults() {
            return inspectionResults.get();
        }

        public void setInspectionResults(String inspectionResults) {
            this.inspectionResults.set(inspectionResults);
        }

        public String getQualityStatus() {
            return qualityStatus.get();
        }

        public void setQualityStatus(String qualityStatus) {
            this.qualityStatus.set(qualityStatus);
        }
    }
    @FXML
    private TextArea inspectionSummaryTextArea;
    @FXML
    private Label warningLabel;

    private ObservableList<EnsureQuality> inspectionRecords = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        // Initialize the quality status ComboBox
        qualityStatusComboBox.setItems(FXCollections.observableArrayList("Passed", "Failed"));

        // Setup TableView columns
        inspectionDateTableColumn.setCellValueFactory(cellData -> cellData.getValue().inspectionDateProperty());
        productNameTableColumn.setCellValueFactory(cellData -> cellData.getValue().productNameProperty());
        inspectionResultsTableColumn.setCellValueFactory(cellData -> cellData.getValue().inspectionResultsProperty());
        qualityStatusTableColumn.setCellValueFactory(cellData -> cellData.getValue().qualityStatusProperty());

        inspectionDataTableView.setItems(inspectionRecords);
    }

    @FXML
    public void submitInspectionButtonOnMouseClick() {
        // Validate input
        if (productNameTextField.getText().isEmpty() || dateOfInspectionDatePicker.getValue() == null || inspectionResultsTextArea.getText().isEmpty()) {
            showWarning("Please fill in all fields.");
            return;
        }

        LocalDate inspectionDate = dateOfInspectionDatePicker.getValue();
        String productName = productNameTextField.getText();
        String inspectionResults = inspectionResultsTextArea.getText();
        String qualityStatus = qualityStatusComboBox.getValue();

        // Create new inspection record
        EnsureQuality record = new EnsureQuality(inspectionDate, productName, inspectionResults, qualityStatus);
        inspectionRecords.add(record);

        showConfirmation("Inspection submitted successfully!");
        clearInputFields();
    }

    @FXML
    public void viewInspectionSummaryButtonOnMouseClick() {
        int passedCount = 0;
        int failedCount = 0;

        for (EnsureQuality record : inspectionRecords) {
            if (record.getQualityStatus().equalsIgnoreCase("Passed")) {
                passedCount++;
            } else if (record.getQualityStatus().equalsIgnoreCase("Failed")) {
                failedCount++;
            }
        }

        inspectionSummaryTextArea.setText(String.format("Total Passed: %d\nTotal Failed: %d", passedCount, failedCount));
    }

    @FXML
    public void trackDefectRatesButtonOnMouseClick() {
        int failedCount = 0;

        for (EnsureQuality record : inspectionRecords) {
            if (record.getQualityStatus().equalsIgnoreCase("Failed")) {
                failedCount++;
            }
        }

        if (failedCount > 0) {
            showWarning("Defect rate exceeded! Please review the failed inspections.");
        } else {
            showConfirmation("Defect rate is within acceptable limits.");
        }
    }

    private void showWarning(String message) {
        warningLabel.setText(message);
        warningLabel.setVisible(true);
    }

    private void showConfirmation(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearInputFields() {
        productNameTextField.clear();
        dateOfInspectionDatePicker.setValue(null);
        inspectionResultsTextArea.clear();
        qualityStatusComboBox.getSelectionModel().clearSelection();
    }
}
