package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TrainingSessionController
{
    @javafx.fxml.FXML
    private TextArea trainingObjectivesTextArea;
    @javafx.fxml.FXML
    private TextField trainerTextField;
    @javafx.fxml.FXML
    private TextField selectTimeTextField;
    @javafx.fxml.FXML
    private DatePicker selectDateDatePicker;
    @javafx.fxml.FXML
    private TextField trainingTopicTextField;
    @javafx.fxml.FXML
    private TextArea trainingAgendaTextArea;
    @javafx.fxml.FXML
    private TextArea showCreatedTrainingSessionTextArea1;


    ArrayList<TrainingSession> traningInfoList;

    @javafx.fxml.FXML
    public void initialize() {

        traningInfoList = new ArrayList<>();

    }

    @javafx.fxml.FXML
    public void createTrainingSessionOnButtonClick(ActionEvent actionEvent) {

        TrainingSession trainingInfotoBeAdded = new TrainingSession(
                trainingTopicTextField.getText(),
                trainerTextField.getText(),
                selectTimeTextField.getText(),
                trainingAgendaTextArea.getText(),
                trainingObjectivesTextArea.getText(),
                selectDateDatePicker.getValue()
        );

        trainingTopicTextField.clear();
        trainerTextField.clear();
        selectTimeTextField.clear();
        trainingAgendaTextArea.clear();
        trainingObjectivesTextArea.clear();


        traningInfoList.add(trainingInfotoBeAdded);



        FileWriter fw = null;
        try{
            File f = new File("Training_Info.txt");
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for(TrainingSession c: traningInfoList){
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
    public void loadTrainingSessionOnButtonClick(ActionEvent actionEvent) {

//        String return_String = "";
//        try{
//            File f = new File("Training_Info.txt");
//            Scanner s = new Scanner(f);
//            while(s.hasNextLine()){
//                return_String += s.nextLine()+ "\n";
//            }
//            showCreatedTrainingSessionTextArea1.setText("");
//            showCreatedTrainingSessionTextArea1.setText(return_String);
//
//
//        }
//        catch(Exception e){
//            //
//        }


        try{
            File f = new File("Training_Info.txt");
            Scanner s = new Scanner(f);
            String str="";
            String[] tokens;
            while(s.hasNextLine()){
                str=s.nextLine();
                tokens = str.split(",");
                TrainingSession c = new TrainingSession(
                        tokens[0], tokens[1], tokens[2], tokens[3], tokens[4],tokens[5]);

                traningInfoList.add(c);

                String listAsString = traningInfoList.toString();
                showCreatedTrainingSessionTextArea1.setText(listAsString);

            }
        }
        catch(Exception e){
            //
        }



    }
}