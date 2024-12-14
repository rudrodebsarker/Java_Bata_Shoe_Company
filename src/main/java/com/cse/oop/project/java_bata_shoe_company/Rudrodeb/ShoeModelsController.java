package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import com.cse.oop.project.java_bata_shoe_company.HelloApplication;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoeModelsController
{
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> moselTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> priceTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> brandComboBox;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> availabilityTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> productCodeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> sizeTableColumn;
    @javafx.fxml.FXML
    private TableColumn<ShoeModel, String> brandTableColumn;
    @javafx.fxml.FXML
    private TextField searchBox;
    @javafx.fxml.FXML
    private TableView<ShoeModel> TableView;
    @javafx.fxml.FXML
    private TextField enterShoeModelTextField;
    @javafx.fxml.FXML
    private TextField codeTextField1;
    @javafx.fxml.FXML
    private TextField priceTextField11;
    @javafx.fxml.FXML
    private TextField sizeTextField;
    @javafx.fxml.FXML
    private RadioButton noRadioButton;
    @javafx.fxml.FXML
    private RadioButton yesRadioButton;


    ArrayList<ShoeModel> showModelInfoList;
    ToggleGroup tg;


    @javafx.fxml.FXML
    public void initialize() {
        showModelInfoList = new ArrayList<>();
        brandComboBox.getItems().addAll("Bata", "Power","North Star","Bubble gummers","Weinbrenner");
        tg = new ToggleGroup();
        yesRadioButton.setToggleGroup(tg);
        noRadioButton.setToggleGroup(tg);


        brandTableColumn.setCellValueFactory(new PropertyValueFactory<ShoeModel,String>("brand"));
        moselTableColumn.setCellValueFactory(new PropertyValueFactory<ShoeModel,String>("shoe_model"));
        productCodeTableColumn.setCellValueFactory(new PropertyValueFactory<ShoeModel,String>("code"));
        availabilityTableColumn.setCellValueFactory(new PropertyValueFactory<ShoeModel,String>("availability"));
        sizeTableColumn.setCellValueFactory(new PropertyValueFactory<ShoeModel,String>("size"));
        priceTableColumn.setCellValueFactory(new PropertyValueFactory<ShoeModel,String>("price"));




    }

    @javafx.fxml.FXML
    public void searchOnButtonClick(ActionEvent actionEvent) {
        try{
            File f = new File("ShoeInfo.txt");
            Scanner s = new Scanner(f);
            String str="";
            String[] tokens;
            while(s.hasNextLine()){
                str=s.nextLine();
                if (str.contains(searchBox.getText())){ }
                tokens = str.split(",");

                ShoeModel c = new ShoeModel(
                        tokens[0], tokens[1], tokens[2],
                        tokens[3], tokens[4], Float.parseFloat(tokens[5]));

                TableView.getItems().add(c);
            }
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
    public void closeWindowOnClick(Event event) {
    }

    @javafx.fxml.FXML
    public void switchToCartOnButtonClick(ActionEvent actionEvent) {
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
    public void addToListandUpdateToFileOnButtonClick(ActionEvent actionEvent) {

        String availability = " ";
        if (yesRadioButton.isSelected())
            availability = "Yes";
        else if (noRadioButton.isSelected()) {
            availability = "No";
        }


        ShoeModel shoeInformationToBeadded = new ShoeModel(
                brandComboBox.getValue(),
                enterShoeModelTextField.getText(),
                codeTextField1.getText(),
                availability,
                sizeTextField.getText(),
                Float.parseFloat(priceTextField11.getText())
        );

        showModelInfoList.add(shoeInformationToBeadded);



        FileWriter fw = null;
        try{
            File f = new File("ShoeInfo.txt");
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for(ShoeModel c: showModelInfoList){
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