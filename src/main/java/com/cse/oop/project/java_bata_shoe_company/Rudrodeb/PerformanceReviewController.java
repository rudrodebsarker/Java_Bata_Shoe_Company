package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PerformanceReviewController
{
    @javafx.fxml.FXML
    private TextField updateRatingTextField;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReview, String> commentsTableColumn;
    @javafx.fxml.FXML
    private TableView<PerformanceReview> tableView;
    @javafx.fxml.FXML
    private TextArea updateCommantsTextArea;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReview, String> ratingTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReview, String> dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReview, String> employeeIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReview, String> jobRolesTableColumn;
    @javafx.fxml.FXML
    private TableColumn<PerformanceReview, String> employeeINameTableColumn;
    @javafx.fxml.FXML
    private TextField enterDateTextField;
    @javafx.fxml.FXML
    private TextField updateNameTextField11;
    @javafx.fxml.FXML
    private TextField updateEmployeeIDTextField1;
    @javafx.fxml.FXML
    private TextField updateJobRolesTextField111;


    ArrayList<PerformanceReview> employeePerformanceList;

    @javafx.fxml.FXML
    public void initialize() {

        employeePerformanceList = new ArrayList<>();


        employeeIDTableColumn.setCellValueFactory(new PropertyValueFactory<PerformanceReview,String>("employee_id"));
        employeeINameTableColumn.setCellValueFactory(new PropertyValueFactory<PerformanceReview,String>("name"));
        jobRolesTableColumn.setCellValueFactory(new PropertyValueFactory<PerformanceReview,String>("job_role"));
        ratingTableColumn.setCellValueFactory(new PropertyValueFactory<PerformanceReview,String>("rating"));
        commentsTableColumn.setCellValueFactory(new PropertyValueFactory<PerformanceReview,String>("comments"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<PerformanceReview,String>("date"));


    }

    @javafx.fxml.FXML
    public void loadPerformanceReviewOnButtonClick(ActionEvent actionEvent) {


        try{
            File f = new File("Employee_Performance_Info.txt");
            Scanner s = new Scanner(f);
            String str="";
            String[] tokens;
            while(s.hasNextLine()){
                str=s.nextLine();
                tokens = str.split(",");
                PerformanceReview c = new PerformanceReview(
                        tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5]);

                tableView.getItems().add(c);
            }
        }
        catch(Exception e){
            //
        }


    }

    @javafx.fxml.FXML
    public void updatePerformanceReviewOnButtonClick(ActionEvent actionEvent) {

        PerformanceReview reviewToBeAdded = new PerformanceReview(
                updateEmployeeIDTextField1.getText(),
                updateNameTextField11.getText(),
                updateJobRolesTextField111.getText(),
                updateRatingTextField.getText(),
                updateCommantsTextArea.getText(),
                enterDateTextField.getText()
        );

        updateEmployeeIDTextField1.clear();
        updateNameTextField11.clear();
        updateJobRolesTextField111.clear();
        updateRatingTextField.clear();
        updateCommantsTextArea.clear();
        enterDateTextField.clear();


        employeePerformanceList.add(reviewToBeAdded);



        FileWriter fw = null;
        try{
            File f = new File("Employee_Performance_Info.txt");
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for(PerformanceReview c: employeePerformanceList){
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
    public void switchToHRdashboardOnButtonClick(ActionEvent actionEvent) {
    }
}