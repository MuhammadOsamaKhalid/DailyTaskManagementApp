package com.example.aws.blogapp.Activities;

public class User {

    public String name;
    public String email;
    public String conEmail;
    public String password;
    public String conPassword;
    public String fatherName;
    public String gender;
    public String occupation;
    public String dob;


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

    public String getConEmail() {
        return conEmail;
    }

    public void setConEmail(String conEmail) {
        this.conEmail = conEmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConPassword() {
        return conPassword;
    }

    public void setConPassword(String conPassword) {
        this.conPassword = conPassword;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public User(String name, String email, String conEmail, String password, String conPassword, String fatherName, String gender, String occupation, String dob) {
        this.name = name;
        this.email = email;
        this.conEmail = conEmail;
        this.password = password;
        this.conPassword = conPassword;
        this.fatherName = fatherName;
        this.gender = gender;
        this.occupation = occupation;
        this.dob = dob;
    }
}

