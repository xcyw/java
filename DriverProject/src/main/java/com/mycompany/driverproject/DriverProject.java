/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.driverproject;

/**
 *
 * @author ashle
 */
public class DriverProject {

    public static void main(String[] args) {
        // variables
        Student studentOne   = new Student();
        // sets student two information
        Student studentTwo   = new Student("Jake", "Peralta", "jperalta@b99.com", 2.3);
        Student studentThree = new Student();
        
        // sets student one information
        studentOne.setFirstName("Amy");
        studentOne.setLastName("Santiago");
        studentOne.setEmail("asantiago@b99.com");
        studentOne.setGPA(4.0);
        // sets student three information
        studentThree.setFirstName("Rosa");
        studentThree.setLastName("Diaz");
        studentThree.setEmail("rdiaz@b99.com");
        studentThree.setGPA(3.0);
        
        // outputs student information
        System.out.println(studentOne);
        System.out.println();
        System.out.println(studentTwo);
        System.out.println();
        System.out.println(studentThree);
    }
}