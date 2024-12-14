package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleInterviewsController
{
    @javafx.fxml.FXML
    private TextArea inputAdditionalInstructionsTextArea;
    @javafx.fxml.FXML
    private DatePicker selectDateFromDatePicker;
    @javafx.fxml.FXML
    private TableColumn candidateNameTableColumn;
    @javafx.fxml.FXML
    private TextField scheduleInterviewTimeTextField;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn applicationIDTableColumn;
    @javafx.fxml.FXML
    private TextField applicationIDTextField;
    @javafx.fxml.FXML
    private TableColumn positionAppliedTableColumn;
    @javafx.fxml.FXML
    private TableColumn attachmentsTableColumn;
    @javafx.fxml.FXML
    private TextArea reviewTotalInformationTextArea;
    @javafx.fxml.FXML
    private TextField candidateNameTextField;
    @javafx.fxml.FXML
    private TextField selectLocationTextField;

    ArrayList<Schedule_Interviews> interviewInfoList;

    @javafx.fxml.FXML
    public void initialize() {

        interviewInfoList = new ArrayList<>();


    }

    @javafx.fxml.FXML
    public void SelectShortlistedApplicantOnButtonClick(ActionEvent actionEvent) {
        Schedule_Interviews interwiewInfoNeedToBeAdded = new Schedule_Interviews(
                applicationIDTextField.getText(),
                candidateNameTextField.getText(),
                scheduleInterviewTimeTextField.getText(),
                selectLocationTextField.getText(),inputAdditionalInstructionsTextArea.getText(),
                selectDateFromDatePicker.getValue()
        );

        applicationIDTextField.clear();
        candidateNameTextField.clear();
        scheduleInterviewTimeTextField.clear();
        selectLocationTextField.clear();
        inputAdditionalInstructionsTextArea.clear();

        interviewInfoList.add(interwiewInfoNeedToBeAdded);

        FileWriter fw = null;
        try{
            File f = new File("Schedule_Interview_Info.txt");
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for(Schedule_Interviews c: interviewInfoList){
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
    public void confirmInterviewScheduleOnButtonClick(ActionEvent actionEvent) {


        String return_String = "";
        try{
            File f = new File("Schedule_Interview_Info.txt");
            Scanner s = new Scanner(f);
            while(s.hasNextLine()){
                return_String += s.nextLine()+ "\n";
            }
            reviewTotalInformationTextArea.setText("");
            reviewTotalInformationTextArea.setText(return_String.toString());
        }
        catch(Exception e){
            //
        }

    }
}