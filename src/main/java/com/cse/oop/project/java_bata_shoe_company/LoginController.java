package com.cse.oop.project.java_bata_shoe_company;

import com.cse.oop.project.java_bata_shoe_company.Rudrodeb.CustomarDashboardController;
import com.cse.oop.project.java_bata_shoe_company.Rudrodeb.HrDashboardController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginController
{
    @FXML
    private TextField passwordTextField;
    @FXML
    private TextField userIDTextField;
    @FXML
    private ComboBox<String> selectUserTypeComboBox;
    @FXML
    private Label warningLabel;

    @FXML
    public void initialize() {

        selectUserTypeComboBox.getItems().addAll("Customer", "HR");

    }

    @FXML
    public void signInOnButtonClick(ActionEvent actionEvent) {

        if(selectUserTypeComboBox.getValue() == "Customer"){

            
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("customar_dashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage refToCurrentStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                refToCurrentStage.setTitle("......");
                refToCurrentStage.setScene(nextScene);
                CustomarDashboardController nextController = fxmlLoader.getController();
                nextController.receiveUserIDfromLoginController(userIDTextField.getText());
                refToCurrentStage.show();



                //nextController.getUserByIDfromFile(userIDTextField.getId()).getUserid().equals(userIDTextField.getText());

//                if (nextController.getUserByIDfromFile(userIDTextField.getId()).getUserid().equals(userIDTextField.getText())){
//                    nextController.receiveUserIDfromLoginController(userIDTextField.getText());
//                    refToCurrentStage.show();
//                }
//                else {
//                    warningLabel.setText("Please enter a valid userID and password");
//                }


//                ArrayList<Signup> userSignupInfoList = new ArrayList<>();
//
//                FileInputStream fis = null;
//                ObjectInputStream ois = null;
//                try {
//                    File f = new File("UserSignupInfo.bin");
//                    if (f.exists()){
//                        fis = new FileInputStream(f);
//                    }
//                    ois = new ObjectInputStream(fis);
//                    while (true){
//                        if (ois!=null){
//                            userSignupInfoList.add((Signup)ois.readObject());
//                        }
//                    }
//                }
//                catch (Exception e){
//                    if (ois!=null)ois.close();
//                }
//
//                for (Signup s: userSignupInfoList){
//                    if (s.getUserid().equals(userIDTextField.getText())){
//
//                        CustomarDashboardController nextController = fxmlLoader.getController();
//                        nextController.receiveUserIDfromLoginController(userIDTextField.getText());
//                        refToCurrentStage.show();
//                    }
//                    else {
//                        warningLabel.setText("Please enter a valid userID and password");
//                    }
//
//                }
//
//
//
//
//                try{
//                    File f = new File("UserSignupInfo.txt");
//                    Scanner s = new Scanner(f);
//                    String str="";
//                    String[] tokens;
//                    while(s.hasNextLine()){
//                        str=s.nextLine();
//                        tokens = str.split(",");
//                        Signup c = new Signup(
//                                tokens[0], tokens[1], tokens[2],
//                                tokens[3],tokens[4],tokens[5],tokens[6],tokens[7]);
//
//                        userSignupInfoList.add(c);
//                    }
//                }
//                catch(Exception e){
//                    //
//                }
//
//                for (Signup s: userSignupInfoList){
//                    if (s.getUserid().equals(userIDTextField.getText()) & s.getPassword().equals(passwordTextField.getText())){
//                        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("customar_dashboard.fxml"));
//                        Scene nextScene = new Scene(fxmlLoader.load());
//                        Stage refToCurrentStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
//                        refToCurrentStage.setTitle("......");
//                        refToCurrentStage.setScene(nextScene);
//                        CustomarDashboardController nextController = fxmlLoader.getController();
//                        nextController.receiveUserIDfromLoginController(userIDTextField.getText());
//                        refToCurrentStage.show();
//                    }
//                    else {
//                        warningLabel.setText("Please enter a valid userID and password");
//                    }
//
//                }



            }
            catch(Exception e){
                //
            }
        }
        else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hr-dashboard.fxml"));
                Scene nextScene = new Scene(fxmlLoader.load());
                Stage refToCurrentStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
                refToCurrentStage.setTitle("......");
                refToCurrentStage.setScene(nextScene);

                HrDashboardController nextController_hr = fxmlLoader.getController();
                nextController_hr.receiveUserIDfromLoginController(userIDTextField.getText());


                refToCurrentStage.show();
            }
            catch(Exception e){
                //
            }
        }



    }

    @FXML
    public void closeWindowOnClick(Event event) {
    }

    @FXML
    public void switchTosignupOnButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("signup.fxml"));
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