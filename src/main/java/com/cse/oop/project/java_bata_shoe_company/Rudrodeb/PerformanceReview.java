package com.cse.oop.project.java_bata_shoe_company.Rudrodeb;

public class PerformanceReview {
    private String employee_id, name, job_role, rating, comments, date;

    public PerformanceReview() {
    }

    public PerformanceReview(String employee_id, String name, String job_role, String rating, String comments, String date) {
        this.employee_id = employee_id;
        this.name = name;
        this.job_role = job_role;
        this.rating = rating;
        this.comments = comments;
        this.date = date;
    }


    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_role() {
        return job_role;
    }

    public void setJob_role(String job_role) {
        this.job_role = job_role;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "PerformanceReview{" +
                "employee_id='" + employee_id + '\'' +
                ", name='" + name + '\'' +
                ", job_role='" + job_role + '\'' +
                ", rating='" + rating + '\'' +
                ", comments='" + comments + '\'' +
                ", date='" + date + '\'' +
                '}';
    }


    public String toString(String reason) {
        return employee_id+","+name+","+job_role+","+rating+","+comments+","+date+"\n";
    }


}
