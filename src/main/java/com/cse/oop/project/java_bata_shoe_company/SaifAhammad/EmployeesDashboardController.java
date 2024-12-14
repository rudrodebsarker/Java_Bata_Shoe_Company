package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

import com.cse.oop.project.java_bata_shoe_company.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class EmployeesDashboardController {

    public MenuItem ApplicationPageOption;
    public MenuItem ApplicationStatusOption;
    @FXML
    private Button AnnouncementsButton;

    @FXML
    private SplitMenuButton ApplicationCenterMenu;

    @FXML
    private Button ExpenseClaimButton;

    @FXML
    private Button PayrollButton;

    @FXML
    private Button SignOutButton;

    @FXML
    private Button UserCenterButton;

    @FXML
    private AnchorPane WelcomeNote;

    @FXML
    private Button WorkShiftButton;

    @FXML
    void ShowAnnouncementsOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Announcements.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Announcements");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowApplicationMenuOnClick(ActionEvent event) {
    }

    @FXML
    void ShowApplicationPageOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("LeaveApplication.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Application Page");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowApplicationStatusOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CheckApplicationStatus.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Application Status");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowExpenseClaimPageOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SubmitExpenses.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Expenses");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowPayrollOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PayrollInfo.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Payroll Information");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowUserCenterOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("UpdateEmployeeInfo.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Employee Information");
            nextStage.setScene(nextScene);
            nextStage.show();
        }
        catch(IOException ignored){
        }

    }

    @FXML
    void ShowWorkShiftOnButtonClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("WorkShift.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage nextStage = new Stage();
            nextStage.setTitle("Work Shift");
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
