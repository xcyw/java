/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project1;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Project1 {

    public static void main(String[] args) {
    // variables
        char operator;
        char userPlay;
        double numOne, numTwo;
        double answer = 0;
        String operation = "";
    
        Scanner scan = new Scanner(System.in);
        
        do{ 
    /* INPUT */
        System.out.println("Hi, I am really good at math! Put me to the test.");
        
        // gets two numbers from user
        System.out.print("Please enter two numbers and then press Enter: ");
        numOne = scan.nextDouble();
        numTwo = scan.nextDouble();
        
        // gets operator from user
        System.out.print("Please enter one of the operations +, -, *, or /"
                          + " and press Enter: ");
        operator = scan.next().charAt(0);
        
    /* CALC */
        // checks what operator is
        switch(operator){
            case '+':
            answer = numOne + numTwo;
            operation = "addition";
            break;
            
            case '-':
            answer = numOne - numTwo;
            operation = "subtraction";
            break;
            
            case '*':
            answer = numOne * numTwo;
            operation = "multiplication";
            break;
            
            case '/':
            answer = numOne / numTwo;
            operation = "division";
            break;
            
            default:
            System.out.print("Invalid operator.");
            System.exit(0);
        }
        
    /* OUTPUT */
        // outputs operation
        System.out.println(numOne + " " + operator + " " + numTwo + " = "
                            + answer);
        System.out.println("I'm great at " + operation + "!");
        
        
        
        // determines if user will repeat program
        System.out.print("Play again [Y/N]?: ");
        userPlay = scan.next().charAt(0);
        
        // makes userPlay variable uppercase
        userPlay = Character.toUpperCase(userPlay);
        
        }while(userPlay == 'Y');
        
        System.out.print("Bye bye!");
    }
    
}
