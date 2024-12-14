package com.cse.oop.project.java_bata_shoe_company;

import java.time.LocalDate;

public class JobOpening {
    private LocalDate DOB;
    private String title, description, requirements;

    public JobOpening() {
    }

    public JobOpening(LocalDate DOB, String title, String description, String requirements) {
        this.DOB = DOB;
        this.title = title;
        this.description = description;
        this.requirements = requirements;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }


    @Override
    public String toString() {
        return "JobOpening{" +
                "DOB=" + DOB +
                ", title='" + title + '\'' +
                ", description='" + title + '\'' +
                ", requirements='" + requirements + '\'' +
                '}';
    }


    public String toString(String reason) {
        return DOB+","+title+","+title+","+requirements+"\n";
    }

}
