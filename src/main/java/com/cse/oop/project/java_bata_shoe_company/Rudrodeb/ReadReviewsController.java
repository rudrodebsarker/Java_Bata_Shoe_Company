package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import com.cse.oop.project.java_bata_shoe_company.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadReviewsController
{
    @javafx.fxml.FXML
    private ComboBox<String> brandComboBox;
    @javafx.fxml.FXML
    private TableColumn<SubmitReview,String> modelTableColumn;
    @javafx.fxml.FXML
    private TableView<SubmitReview> tableView;
    @javafx.fxml.FXML
    private TextField searchBox;
    @javafx.fxml.FXML
    private TableColumn<SubmitReview,String> customaeFeedbackTableColumn;
    @javafx.fxml.FXML
    private TableColumn<SubmitReview,String> codeTableColumn1;
    @javafx.fxml.FXML
    private TableColumn<SubmitReview,String> brandTableColumn11;

    @javafx.fxml.FXML
    public void initialize() {
        brandComboBox.getItems().addAll("Bata", "Power","North Star","Bubble gummers","Weinbrenner");


        modelTableColumn.setCellValueFactory(new PropertyValueFactory<SubmitReview,String>("shoe_model"));
        customaeFeedbackTableColumn.setCellValueFactory(new PropertyValueFactory<SubmitReview,String>("customer_feedback"));
        codeTableColumn1.setCellValueFactory(new PropertyValueFactory<SubmitReview,String>("code"));
        brandTableColumn11.setCellValueFactory(new PropertyValueFactory<SubmitReview,String>("brand"));




    }

    @javafx.fxml.FXML
    public void searchOnButtonClick(ActionEvent actionEvent) {
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

    @javafx.fxml.FXML
    public void loadAllReviewsOnButtonClick(ActionEvent actionEvent) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            File f = new File("Customer_Review_Info.bin");
            if(f.exists()){
                fis = new FileInputStream(f);
            }
            else{
                //
            }
            ois = new ObjectInputStream(fis);

            while(true){
                tableView.getItems().add((SubmitReview) ois.readObject());
            }
        }
        catch(Exception e){
            try{
                if(ois!=null)ois.close();
            }
            catch(Exception e2){
                //
            }

        }
    }
}