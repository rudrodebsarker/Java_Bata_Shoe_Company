package com.cse.oop.project.java_bata_shoe_company;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class MonitorSalesController {

    @FXML
    private TableColumn<MonitorSales, String> PerItemPriceTableColumn;

    @FXML
    private TableColumn<MonitorSales, String> branchNameTableColumn;

    @FXML
    private Label dailyTargetMetLabel;

    @FXML
    private Label dailyTargetNotMetLabel;

    @FXML
    private TableColumn<MonitorSales, String> dailyTargetTableColumn;

    @FXML
    private DatePicker dosDatePicker;

    @FXML
    private TableColumn<MonitorSales, String> dosTableColumn;

    @FXML
    private TableColumn<MonitorSales, String> itemNameTableColumn;

    @FXML
    private TextField itemPriceTextField;

    @FXML
    private ComboBox<String> nameOfBranchComboBox;

    @FXML
    private ComboBox<String> nameItemComboBox;

    @FXML
    private TableColumn<MonitorSales, String> quantityTableColumn;

    @FXML
    private TableView<MonitorSales> salesDataTableView;

    @FXML
    private TableColumn<MonitorSales, String> totalSalesTableColumn;

    @FXML
    private Label warningLabel;

    @FXML
    private TextField quantityTextField;

    private ArrayList<MonitorSales> salesDataLists;

    @FXML
    private TextArea summarizeSalesTextArea;

    @FXML
    private TextArea showAllBranchWeeklySalesTextArea;

    private static final float DAILY_TARGET_VALUE = 145909; // Fixed daily target value

    @FXML
    void addDataSubmitButtonOnMouseClick(ActionEvent event) {
        try {
            // Retrieve values from UI
            String branch = nameOfBranchComboBox.getValue();
            String item = nameItemComboBox.getValue();
            float price = Float.parseFloat(itemPriceTextField.getText());
            int quantity = Integer.parseInt(quantityTextField.getText());
            LocalDate dateOfSale = dosDatePicker.getValue();

            // Validate input
            if (branch == null || item == null || item.isEmpty() || quantity <= 0 || price <= 0 || dateOfSale == null) {
                warningLabel.setText("Please fill all fields correctly.");
                return;
            }

            float totalSales = price * quantity;

            // Check for sales amount validation
            if (totalSales < 1200) {
                warningLabel.setText("Invalid data: Sales amount must be at least 1200.");
                return;
            }

            // Create a new sales data object
            MonitorSales salesData = new MonitorSales(
                    branch,
                    item,
                    String.valueOf(price),
                    String.valueOf(quantity),
                    String.valueOf(totalSales),
                    dateOfSale.toString(),
                    String.valueOf(DAILY_TARGET_VALUE)
            );

            // Add sales data to TableView and list
            salesDataTableView.getItems().add(salesData);
            salesDataLists.add(salesData);

            warningLabel.setText(""); // Clear warning if successful
        } catch (NumberFormatException e) {
            warningLabel.setText("Please enter valid numbers for price and quantity.");
        } catch (NullPointerException e) {
            warningLabel.setText("Please select valid inputs.");
        }
    }

    @FXML
    void summarizeSalesButtonOnMouseClick(ActionEvent event) {
        try {
            LocalDate selectedDate = dosDatePicker.getValue();
            if (selectedDate == null) {
                summarizeSalesTextArea.setText("Please select a valid date to summarize sales.");
                return;
            }

            ArrayList<MonitorSales> salesForDate = (ArrayList<MonitorSales>) salesDataLists.stream()
                    .filter(sales -> sales.getDateOfSale().equals(selectedDate.toString()))
                    .collect(Collectors.toList());

            // Calculate total sales for all stores on the selected date
            float totalSalesSum = salesForDate.stream()
                    .map(sales -> Float.parseFloat(sales.getTotalSales()))
                    .reduce(0f, Float::sum);

            summarizeSalesTextArea.setText("Total Sales for " + selectedDate + ": " + totalSalesSum + " Taka");

            // Check against the daily target
            if (totalSalesSum >= 14400) {
                dailyTargetMetLabel.setVisible(true);
                dailyTargetNotMetLabel.setVisible(false);
            } else {
                dailyTargetMetLabel.setVisible(false);
                dailyTargetNotMetLabel.setVisible(true);
            }

        } catch (Exception e) {
            summarizeSalesTextArea.setText("An error occurred while summarizing sales.");
        }
    }

    @FXML
    void exitButtonOnMouseClick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void showAllBranchesWeeklySalesButtonOnMouseClick(ActionEvent event) {
        showAllBranchWeeklySalesTextArea.setText("Feature not implemented yet.");
    }

    @FXML
    void initialize() {
        salesDataLists = new ArrayList<>();

        nameItemComboBox.getItems().addAll("Boot", "Slipper", "Sandel");
        nameOfBranchComboBox.getItems().addAll("Store 1", "Store 2", "Store 3", "Store 4");

        nameItemComboBox.setValue("Boot");
        nameOfBranchComboBox.setValue("Store 1");

        // Set up TableView columns
        branchNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("branchName"));
        itemNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("itemName"));
        PerItemPriceTableColumn.setCellValueFactory(new PropertyValueFactory<>("itemPrice"));
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        totalSalesTableColumn.setCellValueFactory(new PropertyValueFactory<>("totalSales"));
        dosTableColumn.setCellValueFactory(new PropertyValueFactory<>("dateOfSale"));
        dailyTargetTableColumn.setCellValueFactory(new PropertyValueFactory<>("dailyTarget"));

        // Initialize labels for daily target
        dailyTargetMetLabel.setVisible(false);
        dailyTargetNotMetLabel.setVisible(false);
    }
}
