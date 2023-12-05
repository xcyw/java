/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.driverproject;

/**
 *
 * @author ashle
 */

public class Student {
    // variables
    private String firstName;
    private String lastName;
    private String email;
    private double gpa;
    
    // constructor
    public Student() {
        firstName = "";
        lastName  = "";
        email     = "";
        gpa       = 0;
    }
    
    // overloaded constructor
    public Student(String firstName, String lastName, String email, double gpa) {
        this.firstName = firstName;
        this.lastName  = lastName;
        this.email     = email;
        this.gpa       = gpa;
    }
    
    // setter and getters
    
    // firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    // lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    // email
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    // gpa
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }
    public double getGPA() {
        return gpa;
    }
    
    // override method toString()
    @Override
    public String toString() {
        return "Student Name: "  + firstName + " " + lastName + "\nStudent Email: " + email + "\nStudent GPA: " + gpa;
    }
        
}

