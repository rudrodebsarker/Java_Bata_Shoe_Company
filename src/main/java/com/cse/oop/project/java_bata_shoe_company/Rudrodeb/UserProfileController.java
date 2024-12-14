package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import javafx.scene.control.Label;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class UserProfileController
{
    @javafx.fxml.FXML
    private Label administratorLabel;
    @javafx.fxml.FXML
    private Label phoneLabel;
    @javafx.fxml.FXML
    private Label userIDlabel;
    @javafx.fxml.FXML
    private Label addressLabel;
    @javafx.fxml.FXML
    private Label dobLabel;
    @javafx.fxml.FXML
    private Label emailLabel;
    @javafx.fxml.FXML
    private Label nameLabel;
    @javafx.fxml.FXML
    private Label passwordLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }



    public void receiveUserIDfromCustomerDashboardController(String userID){
        userIDlabel.setText(userID);
        Signup c = getUserByIDfromFile(userID);
        passwordLabel.setText(c.getPassword());
        nameLabel.setText(c.getName());
        emailLabel.setText(c.getEmail());
        phoneLabel.setText(c.getPhone());
        addressLabel.setText(c.getAddress());
        dobLabel.setText(String.valueOf(c.getDOB()));

    }


    public Signup getUserByIDfromFile(String userID){
        ArrayList<Signup> userList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            File f = new File("UserSignupInfo.bin");
            if (f.exists()){
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);

                while (true){
                    userList.add((Signup) ois.readObject());
                }
            }
        }
        catch (Exception e){
            try {
                if (ois!=null)ois.close();
            }
            catch (Exception e2){
                //
            }

        }
        Signup targetUser = null;
        for(Signup c: userList){
            if (c.getUserid().equals(userID)){
                //targetUser = new Signup(c.getUserid(),c.getPassword(),c.getName(),c.getEmail(),c.getPhone(),c.getAdmimistrator(),c.getAddress(),c.getDOB());
                targetUser = c;
            }
        }
        return targetUser;
    }




}