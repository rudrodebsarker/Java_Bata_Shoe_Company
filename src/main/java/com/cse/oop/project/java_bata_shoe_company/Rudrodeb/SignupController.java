package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;

public class SignupController
{
    @javafx.fxml.FXML
    private TextField emailTextField1;
    @javafx.fxml.FXML
    private TextField inputUserIDTextField;
    @javafx.fxml.FXML
    private TextField inputPasswordTextField;
    @javafx.fxml.FXML
    private TextField phoneTextField11;
    @javafx.fxml.FXML
    private TextArea addressTextArea;
    @javafx.fxml.FXML
    private TextField nameTextField1;
    @javafx.fxml.FXML
    private DatePicker inputDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> inputUserTypeComboBox;


    ArrayList<Signup> signupInformationList;


    @javafx.fxml.FXML
    public void initialize() {
        signupInformationList = new ArrayList<>();

        inputDateDatePicker.setValue(LocalDate.now());
        inputUserTypeComboBox.getItems().addAll("Customer", "HR");




    }

    @javafx.fxml.FXML
    public void closeWindowOnClick(Event event) {
    }

    @javafx.fxml.FXML
    public void signupOnButtonClick(ActionEvent actionEvent) {

        Signup informationToBeAdded = new Signup(
                inputUserIDTextField.getText(),
                inputPasswordTextField.getText(),
                nameTextField1.getText(),
                emailTextField1.getText(),
                phoneTextField11.getText(),
                inputUserTypeComboBox.getValue(),
                addressTextArea.getText(),
                inputDateDatePicker.getValue()

        );

        inputUserIDTextField.clear();
        inputPasswordTextField.clear();
        nameTextField1.clear();
        phoneTextField11.clear();
        addressTextArea.clear();

        signupInformationList.add(informationToBeAdded);


//        try{
//            File f = new File("UserSignupInfo.bin");
//            FileOutputStream fos = null;
//            ObjectOutputStream oos = null;
//
//            if(f.exists()){
//                fos = new FileOutputStream(f, true);
//                oos = new AppendableObjectOutputStream(fos);
//            }
//            else{
//                fos = new FileOutputStream(f);
//                oos = new ObjectOutputStream(fos);
//            }
//            for (Signup c : signupInformationList){
//                oos.writeObject(c);
//            }
//            oos.close();
//        }
//        catch(Exception e){
//            //
//        }





        FileWriter fw = null;
        try{
            File f = new File("UserSignupInfo.txt");
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for(Signup c: signupInformationList){
                str+=c.toString("for file");
            }
            fw.write(str);
            fw.close();
        }
        catch(Exception e){
            //
        }




    }
}