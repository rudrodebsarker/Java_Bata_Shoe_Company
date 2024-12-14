package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import com.cse.oop.project.java_bata_shoe_company.AppendableObjectOutputStream;
import com.cse.oop.project.java_bata_shoe_company.HelloApplication;
import com.cse.oop.project.java_bata_shoe_company.Signup;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SubmitReviewController
{
    @javafx.fxml.FXML
    private TextArea customerFeedbackTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> brandComboBox;
    @javafx.fxml.FXML
    private TextField enterShoeModelTextField;
    @javafx.fxml.FXML
    private TextField enterCodeTextField1;


    ArrayList<SubmitReview> customarFeedbackList;

    @javafx.fxml.FXML
    public void initialize() {
        customarFeedbackList = new ArrayList<>();
        brandComboBox.getItems().addAll("Bata", "Power","North Star","Bubble gummers","Weinbrenner");




    }

    @javafx.fxml.FXML
    public void handleLogoutOnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
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

    @javafx.fxml.FXML
    public void submitReviewOnClick(ActionEvent actionEvent) {

        SubmitReview feedbackInfoNeedToBeAdded = new SubmitReview(
                enterShoeModelTextField.getText(),
                customerFeedbackTextArea.getText(),
                enterCodeTextField1.getText(),
                brandComboBox.getValue()
        );

        customarFeedbackList.add(feedbackInfoNeedToBeAdded);

        try{
            File f = new File("Customer_Review_Info.bin");
            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if(f.exists()){
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            for (SubmitReview c : customarFeedbackList){
                oos.writeObject(c);
            }
            oos.close();
        }
        catch(Exception e){
            //
        }


    }

    @javafx.fxml.FXML
    public void switchToDashboardButtonOnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("customar_dashboard.fxml"));
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