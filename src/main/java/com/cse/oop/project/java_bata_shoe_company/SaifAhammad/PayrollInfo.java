package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;
public class PayrollInfo {
   private String Column1;
   private String Column2;

    public PayrollInfo(String nameColumn, String salaryColumn) {
        Column1 = nameColumn;
        Column2 = salaryColumn;
    }
    public String getColumn1() {
        return Column1;
    }
    public String getColumn2() {
        return Column2;
    }

    public void setColumn1(String column1) {
        Column1 = column1;
    }

    public void setColumn2(String column2) {
        Column2 = column2;
    }
}