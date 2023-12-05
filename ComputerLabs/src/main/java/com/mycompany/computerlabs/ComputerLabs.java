/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computerlabs;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ashle
 */
public class ComputerLabs {

    public static void main(String[] args) {
        // variables
        Scanner scan = new Scanner(System.in);
        
        String id      = "";
        int labNum     = 0;
        int stationNum = 0;
        int menuInput  = 0;
        
        ArrayList <Integer>[] labRow = new ArrayList[4];
        
        // creates lab rows
        labRow[0] = new ArrayList<>(); 
        labRow[1] = new ArrayList<>();
        labRow[2] = new ArrayList<>();
        labRow[3] = new ArrayList<>();
        
        // MAIN CODE
        do {
            // gets user input from menu
            displayMenu();
            menuInput = scan.nextInt();
            scan.nextLine();
                        
            switch(menuInput) {
                // quit
                case 0 -> {
                }
                
                // login
                case 1 -> {
                    System.out.println("Enter the 5 digit ID number of the user logging in:");
                    id = scan.nextLine();
                    
                    System.out.println("Enter the lab number the user is logging in from (1-4):");
                    labNum = scan.nextInt();
                    
                    System.out.println("Enter the computer station number the user is logging in to (1-6):");
                    stationNum = scan.nextInt();
                    
                    // add id to array[stationNum][labNum]
                    
                    
                    // displays current lab status
                    displayLab(labRow);
                }
                
                // logoff
                case 2 -> {
                    System.out.println("Enter the lab number the user is logging off from (1-4):");
                    labNum = scan.nextInt();
                    
                    System.out.println("Enter the computer station number the user is logging off from (1-6):");
                    stationNum = scan.nextInt();
                    
                    // add "empty" to array[stationNum][labNum]
                    
                    
                    
                    // confirms user has logged off
                    System.out.println("User " + id + " is logged off.");
                    System.out.println();
                    
                    // displays current lab status
                    displayLab(labRow);
                }
                
                // search
                case 3 -> {
                    // yoinks the id in array[stationNum][labNum]
                    // id.equals(whatever u yoinked);
                    
                    
                    
                    // displays current lab status
                    displayLab(labRow);
                }
                
                // default
                default -> {
                    menuInput = 0;
                }
            }
            
        } while(menuInput != 0);
        
    }
    
    /* -------------------------------------------------------------------- */
    /* FUNCTION DEFINITION */
    
    /* displayMenu:
    *  -----------
    *  display menu options
    */
    public static void displayMenu() {
        System.out.println("MAIN MENU");
        System.out.println("0) Quit");
        System.out.println("1) Simulate login");
        System.out.println("2) Simulate logoff");
        System.out.println("3) Search");
        System.out.println();
    }
    
    /* displayLab
    *  ----------
    *  display current lab status
    */
    public static void displayLab(ArrayList<Integer>[] labRow) {
        for (int labNumber = 0; labNumber < 4; labNumber++) {
                System.out.print((labNumber + 1) + " ");
                for (int stationNumber = 1; stationNumber <= getLabNumStation(labNumber); stationNumber++) {
                    if (labRow[labNumber].contains(stationNumber)) {
                        System.out.print(stationNumber + ": " + labRow[labNumber].get(labRow[labNumber].indexOf(stationNumber)) + " ");
                    } else {
                        System.out.print(stationNumber + ": empty ");
                    }
                }
                System.out.println();
            }
    }
    
    public static void searchUser(ArrayList<Integer>[] labRow) {
        for (int labNumber = 0; labNumber < 4; labNumber++) {
                System.out.print((labNumber + 1) + " ");
                for (int stationNumber = 1; stationNumber <= getLabNumStation(labNumber); stationNumber++) {
                    if (labRow[labNumber].contains(stationNumber)) {
                        System.out.print(stationNumber + ": " + labRow[labNumber].get(labRow[labNumber].indexOf(stationNumber)) + " ");
                    } else {
                        System.out.print(stationNumber + ": empty ");
                    }
                }
                System.out.println();
            }
    }
    
    public static void addUser(ArrayList<Integer>[] labRow) {
        
    }
    
    public static int getLabNumStation(int labNum) {
        int labNumStation = 0;
        
        switch(labNum) 
        {
            case 0 -> {
                labNumStation = 5;
            }
            case 1 -> {
                labNumStation = 6;
            }
            case 2 -> {
                labNumStation = 4;
            }
            case 3 -> {
                labNumStation = 3;
            }
        }
        
        return labNumStation;
    }
    
    
    /* -------------------------------------------------------------------- */
}
    
    /* LAB STATUS
    *  Lab #    Computer Stations
    *  1        1: empty 2: empty 3: empty 4: empty 5: empty
    *  2        1: empty 2: empty 3: empty 4: empty 5: empty 6: empty
    *  3        1: empty 2: empty 3: empty 4: empty
    *  4        1: empty 2: empty 3: empty
    */
