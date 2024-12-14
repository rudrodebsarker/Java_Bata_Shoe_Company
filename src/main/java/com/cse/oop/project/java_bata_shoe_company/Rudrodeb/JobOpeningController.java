package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JobOpeningController
{
    @FXML
    private TextArea jobDescriptionTextArea;
    @FXML
    private TextArea jobRequarmentsTextArea;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextField enterJobTitleTextField;
    @FXML
    private TextArea reviewInformationTextArea;


    ArrayList<JobOpening> informationList;


    @FXML
    public void initialize() {
        informationList = new ArrayList<>();

    }


    @FXML
    public void closeJobOpeningOnButtonClick(ActionEvent actionEvent) {
    }


    @FXML
    public void reviewInformationOnButtonClick(ActionEvent actionEvent) {
//        JobOpening informationToBeAdded = new JobOpening(
//                datePicker.getValue(),
//                enterJobTitleTextField.getText(),
//                jobDescriptionTextArea.getText(),
//                jobRequarmentsTextArea.getText()
//        );
//        informationList.add(informationToBeAdded);
//
//        reviewInformationTextArea.setText(String.valueOf(informationList));



        String return_String = "";

//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        try{
//            File f = new File("JobOpeningInfo.bin");
//            if(f.exists()){
//                fis = new FileInputStream(f);
//            }
//            else{
//                //
//            }
//            ois = new ObjectInputStream(fis);
//
//            while(true){
//                return_String += ((JobOpening)ois.readObject()).toString() + '\n';
//            }
//        }
//        catch(Exception e){
//            reviewInformationTextArea.setText(return_String);
//        }



        try{
            File f = new File("JobOpeningInfo.txt");
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                return_String += s.nextLine()+ "\n";
            }
            reviewInformationTextArea.setText("");
            reviewInformationTextArea.setText(return_String);
        }
        catch(Exception e){
            //
        }





    }

    @FXML
    public void creatInputInformationPdfAndpostJobOpeningOnButtonClick(ActionEvent actionEvent) {
    }

    @FXML
    public void addInformationToFileOnButtonClick(ActionEvent actionEvent) {
        JobOpening informationToBeAdded = new JobOpening(
                datePicker.getValue(),
                enterJobTitleTextField.getText(),
                jobDescriptionTextArea.getText(),
                jobRequarmentsTextArea.getText()
        );
        informationList.add(informationToBeAdded);

//        try{
//            File f = new File("JobOpeningInfo.bin");
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
//            for (JobOpening c : informationList){
//                oos.writeObject(c);
//            }
//            oos.close();
//        }
//        catch(Exception e){
//            //
//        }



        FileWriter fw = null;
        try{
            File f = new File("JobOpeningInfo.txt");
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for(JobOpening c: informationList){
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