package com.cse.oop.project.java_bata_shoe_company;

import java.time.LocalDate;

public class Signup {
    private String userid;
    private String password;
    private String name, email, phone, admimistrator, address;
    private LocalDate DOB;


    public Signup(String token, String password, String name, String email, String phone, String admimistrator, String address, String s) {
    }

    public Signup(String userid, String password, String name, String email, String phone, String admimistrator, String address, LocalDate DOB) {
        this.userid = userid;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.admimistrator = admimistrator;
        this.address = address;
        this.DOB = DOB;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdmimistrator() {
        return admimistrator;
    }

    public void setAdmimistrator(String admimistrator) {
        this.admimistrator = admimistrator;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Signup{" +
                "userid=" + userid +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", admimistrator='" + admimistrator + '\'' +
                ", address='" + address + '\'' +
                ", DOB=" + DOB +
                '}';
    }


    public String toString(String reason){
        return userid+","+password+","+name+","+email+","+phone+","+admimistrator+","+address+","+DOB+"\n";
    }

}
