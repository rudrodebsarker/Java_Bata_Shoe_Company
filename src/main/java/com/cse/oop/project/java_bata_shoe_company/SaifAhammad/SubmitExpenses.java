package com.cse.oop.project.java_bata_shoe_company.SaifAhammad;

public class SubmitExpenses {
    String ExpenseTitle;
    double ExpenseAmount;
    String ExpenseDate;
    public SubmitExpenses(String ExpenseTitle, double ExpenseAmount, String ExpenseDate) {
        this.ExpenseTitle = ExpenseTitle;
        this.ExpenseAmount = ExpenseAmount;
        this.ExpenseDate = ExpenseDate;
    }
    public String getExpenseTitle() {
        return ExpenseTitle;
    }
    public void setExpenseTitle(String ExpenseTitle) {
        this.ExpenseTitle = ExpenseTitle;
    }
    public double getExpenseAmount() {
        return ExpenseAmount;
    }
    public void setExpenseAmount(double ExpenseAmount) {
        this.ExpenseAmount = ExpenseAmount;
    }
    public String getExpenseDate() {
        return ExpenseDate;
    }
    public void setExpenseDate(String ExpenseDate) {
        this.ExpenseDate = ExpenseDate;
    }
}
