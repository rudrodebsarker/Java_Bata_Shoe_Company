package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

import com.cse.oop.project.java_bata_shoe_company.AppendableObjectOutputStream;
import com.cse.oop.project.java_bata_shoe_company.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AccessPromotionsController
{
    @javafx.fxml.FXML
    private ComboBox<String> brandComboBox;
    @javafx.fxml.FXML
    private TableColumn<AccessPromotion, String> validityPeriodTableColumn;
    @javafx.fxml.FXML
    private TableView<AccessPromotion> tableView;
    @javafx.fxml.FXML
    private TextField searchBox;
    @javafx.fxml.FXML
    private TableColumn<AccessPromotion, String> brandTableColumn1;
    @javafx.fxml.FXML
    private TextArea discountInfoTextArea;
    @javafx.fxml.FXML
    private TextField modelTextField;
    @javafx.fxml.FXML
    private TextField validityPeriodTextField;
    @javafx.fxml.FXML
    private TableColumn<AccessPromotion, String> modelTableColumn;
    @javafx.fxml.FXML
    private TableColumn<AccessPromotion, String> discountInformationTableColumn;

    ArrayList<AccessPromotion> prpmotionList;


    @javafx.fxml.FXML
    public void initialize() {
        prpmotionList = new ArrayList<>();
        brandComboBox.getItems().addAll("Bata", "Power","North Star","Bubble gummers","Weinbrenner");


        modelTableColumn.setCellValueFactory(new PropertyValueFactory<AccessPromotion,String>("model"));
        discountInformationTableColumn.setCellValueFactory(new PropertyValueFactory<AccessPromotion,String>("discount_info"));
        validityPeriodTableColumn.setCellValueFactory(new PropertyValueFactory<AccessPromotion,String>("validity_period"));
        brandTableColumn1.setCellValueFactory(new PropertyValueFactory<AccessPromotion,String>("brand"));


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
    public void updatePromotionInfotoFileOnButtonClick(ActionEvent actionEvent) {
        AccessPromotion promotionInfoTobeAdded = new AccessPromotion(
          modelTextField.getText(),
          discountInfoTextArea.getText(),
          validityPeriodTextField.getText(),
          brandComboBox.getValue()
        );

        modelTextField.clear();
        discountInfoTextArea.clear();
        validityPeriodTextField.clear();


        prpmotionList.add(promotionInfoTobeAdded);



//        try{
//            File f = new File("Promotion_Info.bin");
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
//            for (AccessPromotion c : prpmotionList){
//                oos.writeObject(c);
//            }
//            oos.close();
//        }
//        catch(Exception e){
//            //
//        }



        FileWriter fw = null;
        try{
            File f = new File("Promotion_Info.txt");
            if(f.exists()){
                fw = new FileWriter(f, true);
            }
            else{
                fw = new FileWriter(f);
            }

            String str = "";
            for(AccessPromotion c: prpmotionList){
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
    public void loadPromotionInfofromFileOnButtonClick(ActionEvent actionEvent) {



//        FileInputStream fis = null;
//        ObjectInputStream ois = null;
//        try{
//            File f = new File("Promotion_Info.bin");
//            if(f.exists()){
//                fis = new FileInputStream(f);
//            }
//            else{
//                //
//            }
//            ois = new ObjectInputStream(fis);
//
//            while(true){
//                tableView.getItems().add((AccessPromotion)ois.readObject());
//            }
//        }
//        catch(Exception e){
//            try{
//                if(ois!=null)ois.close();
//            }
//            catch(Exception e2){
//                //
//            }
//
//        }




        try{
            File f = new File("Promotion_Info.txt");
            Scanner s = new Scanner(f);
            String str="";
            String[] tokens;
            while(s.hasNextLine()){
                str=s.nextLine();
                tokens = str.split(",");
                AccessPromotion c = new AccessPromotion(
                        tokens[0], tokens[1], tokens[2],
                        tokens[3]);

                tableView.getItems().add(c);
            }
        }
        catch(Exception e){
            //
        }





    }
}