package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import com.cse.oop.project.java_bata_shoe_company.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ManageEmployeesController
{
    @javafx.fxml.FXML
    private TableColumn<ManageEmployee, String> additionalInfoTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageEmployee, String> contactDetailsTableColumn;
    @javafx.fxml.FXML
    private TableView<ManageEmployee> tableView;
    @javafx.fxml.FXML
    private TableColumn<ManageEmployee, String> employeeIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageEmployee, String> jobRolesTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ManageEmployee, String> employeeINameTableColumn;
    @javafx.fxml.FXML
    private TextField enterJobRolesTextField;
    @javafx.fxml.FXML
    private TextField enterEmolpyNameTextField;
    @javafx.fxml.FXML
    private TextField enterEmolpyIDTextField;
    @javafx.fxml.FXML
    private TextArea enterAdditionalInfoTextArea;
    @javafx.fxml.FXML
    private TextField enterContactDetailsTextField;

    ArrayList<ManageEmployee> employeeList;

    @javafx.fxml.FXML
    public void initialize() {

        employeeList = new ArrayList<>();


        employeeIDTableColumn.setCellValueFactory(new PropertyValueFactory<ManageEmployee,String>("employeeID"));
        employeeINameTableColumn.setCellValueFactory(new PropertyValueFactory<ManageEmployee,String>("employeeName"));
        jobRolesTableColumn.setCellValueFactory(new PropertyValueFactory<ManageEmployee,String>("jobRoles"));
        contactDetailsTableColumn.setCellValueFactory(new PropertyValueFactory<ManageEmployee,String>("contactDetails"));
        additionalInfoTableColumn.setCellValueFactory(new PropertyValueFactory<ManageEmployee,String>("additionalInfo"));

    }


    @javafx.fxml.FXML
    public void loadEmployeeRecordsOnButtonClick(ActionEvent actionEvent) {

        try{
            File f = new File("Employee_Info.txt");
            Scanner s = new Scanner(f);
            String str="";
            String[] tokens;
            while(s.hasNextLine()){
                str=s.nextLine();
                tokens = str.split(",");
                ManageEmployee c = new ManageEmployee(
                        tokens[0], tokens[1], tokens[2], tokens[3], tokens[4]);

                tableView.getItems().add(c);
            }
        }
        catch(Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void updateEmployeeRecordsOnButtonClick(ActionEvent actionEvent) {
        ManageEmployee employeeToBeAdded = new ManageEmployee(
                enterEmolpyIDTextField.getText(),
                enterEmolpyNameTextField.getText(),
                enterJobRolesTextField.getText(),
                enterContactDetailsTextField.getText(),
                enterAdditionalInfoTextArea.getText()
        );

        enterEmolpyNameTextField.clear();
        enterEmolpyNameTextField.clear();
        enterJobRolesTextField.clear();
        enterContactDetailsTextField.clear();
        enterAdditionalInfoTextArea.clear();


        employeeList.add(employeeToBeAdded);


        FileWriter fw = null;
        try{
            File f = new File("Employee_Info.txt");
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for(ManageEmployee c: employeeList){
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
    public void SwitchToHRdashboardOnButtonClick(ActionEvent actionEvent) {

        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hr-dashboard.fxml"));
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