package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HandlePayrollController
{
    @javafx.fxml.FXML
    private TextField bonusesTextField;
    @javafx.fxml.FXML
    private TableColumn<HandlePayroll, String> deductionsTableColimn;
    @javafx.fxml.FXML
    private TableColumn<HandlePayroll, String> pymentDateTableColumn;
    @javafx.fxml.FXML
    private TextField deductionsTextField;
    @javafx.fxml.FXML
    private TableView<HandlePayroll> tableView;
    @javafx.fxml.FXML
    private TableColumn<HandlePayroll, String> bonusesTableColumn;
    @javafx.fxml.FXML
    private TableColumn<HandlePayroll, String> baseSalaryTableColumn;
    @javafx.fxml.FXML
    private TextField employeeIdTextField;
    @javafx.fxml.FXML
    private TextField baseSalaryTextField;
    @javafx.fxml.FXML
    private TableColumn<HandlePayroll, String> totalSalaryTableColumn;
    @javafx.fxml.FXML
    private TableColumn<HandlePayroll, String> employeeIdTableColumn;
    @javafx.fxml.FXML
    private DatePicker selectPymentDateDatePicker;
    @javafx.fxml.FXML
    private Label showTotalSalarylabell;


    ArrayList<HandlePayroll> payrollArrayList;


    @javafx.fxml.FXML
    public void initialize() {
        payrollArrayList = new ArrayList<>();

        employeeIdTableColumn.setCellValueFactory(new PropertyValueFactory<HandlePayroll,String>("employeeID"));
        baseSalaryTableColumn.setCellValueFactory(new PropertyValueFactory<HandlePayroll,String>("baseSalary"));
        bonusesTableColumn.setCellValueFactory(new PropertyValueFactory<HandlePayroll,String>("bonuses"));
        deductionsTableColimn.setCellValueFactory(new PropertyValueFactory<HandlePayroll,String>("deduction"));
        totalSalaryTableColumn.setCellValueFactory(new PropertyValueFactory<HandlePayroll,String>("totalSalary"));
        pymentDateTableColumn.setCellValueFactory(new PropertyValueFactory<HandlePayroll,String>("DOB"));

    }

    @javafx.fxml.FXML
    public void updateRecordsOnButtonClick(ActionEvent actionEvent) {
        HandlePayroll payInfoToBeAdded  = new HandlePayroll(
                employeeIdTextField.getText(),
                Double.parseDouble(baseSalaryTextField.getText()),
                Double.parseDouble(bonusesTextField.getText()),
                Double.parseDouble(deductionsTextField.getText()),
                Double.parseDouble(showTotalSalarylabell.getText()),
                selectPymentDateDatePicker.getValue()
        );

        employeeIdTextField.clear();
        baseSalaryTextField.clear();
        bonusesTextField.clear();
        deductionsTextField.clear();

        payrollArrayList.add(payInfoToBeAdded);

        FileWriter fw = null;
        try{
            File f = new File("Payroll_Info.txt");
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for(HandlePayroll c: payrollArrayList){
                str+=c.toString("for file");
            }
            fw.write(str);
            fw.close();
        }
        catch(Exception e){
            //
        }


    }

    @javafx.fxml.FXML
    public void calculayeTotalOnButtonClick(ActionEvent actionEvent) {
        double base_Salary = Double.parseDouble(baseSalaryTextField.getText());
        double deductions = Double.parseDouble(deductionsTextField.getText())/100.0;
        double bonuses = Double.parseDouble(bonusesTextField.getText())/100.0;

        double totalSalary = base_Salary + (base_Salary * bonuses) - (base_Salary * deductions);
        showTotalSalarylabell.setText(String.valueOf(totalSalary));

    }

    @javafx.fxml.FXML
    public void loadPymentInformationOnButtonClick(ActionEvent actionEvent) {

        try{
            File f = new File("Payroll_Info.txt");
            Scanner s = new Scanner(f);
            String str="";
            String[] tokens;
            while(s.hasNextLine()){
                str=s.nextLine();
                tokens = str.split(",");
                HandlePayroll c = new HandlePayroll(
                        tokens[0], Double.parseDouble(tokens[1]), Double.parseDouble(tokens[2]),
                        Double.parseDouble(tokens[3]), Double.parseDouble(tokens[4]), tokens[5]);

                tableView.getItems().add(c);
            }
        }
        catch(Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void generatePayslipOnButtonClick(ActionEvent actionEvent) {
    }
}