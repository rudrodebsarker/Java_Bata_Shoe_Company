module com.cse.oop.project.java_bata_shoe_company {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.cse.oop.project.java_bata_shoe_company to javafx.fxml;
    exports com.cse.oop.project.java_bata_shoe_company;
}