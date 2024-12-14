package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import com.cse.oop.project.java_bata_shoe_company.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomarDashboardController
{
    @javafx.fxml.FXML
    private ListView<String> checkNotifications;
    @javafx.fxml.FXML
    private Label statusLabel;
    @javafx.fxml.FXML
    private TextField searchBox;
    @javafx.fxml.FXML
    private Label userIDLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchOnButtonClick(ActionEvent actionEvent) {
    }


    public void receiveUserIDfromLoginController(String userID){
        userIDLabel.setText(userID);
        Signup c = getUserByIDfromFile(userID);
    }


    public Signup getUserByIDfromFile(String userID){
//        ArrayList<Signup> userList = new ArrayList<>();
//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        try {
//            File f = new File("UserSignupInfo.bin");
//            if (f.exists()){
//                fis = new FileInputStream(f);
//                ois = new ObjectInputStream(fis);
//
//                while (true){
//                    userList.add((Signup) ois.readObject());
//                }
//            }
//        }
//        catch (Exception e){
//            try {
//                if (ois!=null)ois.close();
//            }
//            catch (Exception e2){
//                //
//            }
//
//        }
//
//        Signup targetUser = null;
//        for(Signup c: userList){
//            if (c.getUserid().equals(userID)){
//                //targetUser = new Signup(c.getUserid(),c.getPassword(),c.getName(),c.getEmail(),c.getPhone(),c.getAdmimistrator(),c.getAddress(),c.getDOB());
//                targetUser = c;
//            }
//        }
//        return targetUser;



        ArrayList<Signup> userInfoList = new ArrayList<>();
        try{
            File f = new File("UserSignupInfo.txt");
            Scanner s = new Scanner(f);
            String str="";
            String[] tokens;
            while(s.hasNextLine()){
                str=s.nextLine();
                tokens = str.split(",");
                Signup c = new Signup(
                        tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6], tokens[7]);

                userInfoList.add(c);
            }
        }
        catch(Exception e){
            //
        }

        Signup targetUser = null;
        for(Signup c: userInfoList){
            if (c.getUserid().equals(userID)){
                //targetUser = new Signup(c.getUserid(),c.getPassword(),c.getName(),c.getEmail(),c.getPhone(),c.getAdmimistrator(),c.getAddress(),c.getDOB());
                targetUser = c;
            }
        }
        return targetUser;

    }



    @javafx.fxml.FXML
    public void switchPromotionOnButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("access_promotions.fxml"));
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
    public void switchReadReviewOnButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("read_reviews.fxml"));
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
    public void switchCartOnButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cart.fxml"));
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
    public void closeWindowOnClick(Event event) {
    }

    @javafx.fxml.FXML
    public void switchShoeModelsOnButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("shoe_models.fxml"));
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
    public void handleUserProfileOnClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("user_profile.fxml"));
            Scene nextScene = new Scene(fxmlLoader.load());
            Stage refToCurrentStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            refToCurrentStage.setTitle("User Profile");
            refToCurrentStage.setScene(nextScene);
            UserProfileController nextController_profile = fxmlLoader.getController();
            nextController_profile.receiveUserIDfromCustomerDashboardController(userIDLabel.getText());
            refToCurrentStage.show();
        }
        catch(Exception e){
            //
        }


    }

    @javafx.fxml.FXML
    public void switchSubmitReviewOnButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("submit_review.fxml"));
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
    public void switchOrderOnButtonClick(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("order.fxml"));
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