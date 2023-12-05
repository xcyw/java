/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project2;

import java.util.Scanner;

/**
 *
 * @author ashle
 */
public class Project2 {

    public static void main(String[] args) {
        // variables
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String enc     = "kngcadsxbvfhjtiumylzqropwe";
        
        String word;
        String current;
        String process      = "";
        String output       = "";
        
        int index;
        
        char input;
        
        Scanner scan = new Scanner(System.in);
        
        /* INPUT */
        // prompts the user for an action (encode, decode, or quit)
        System.out.println("Enter 1 to encode, 2 to decode, 3 to quit: ");
        input = scan.nextLine().charAt(0);
        
        
        while(input != '3')
        {
            if(input == '1')
                process = "encode";
            else if(input == '2')
                process = "decode";
            
            // prompts user for word to encode / decode
            System.out.println("Enter text to " + process + ": ");
            word = scan.nextLine();
           
            /* ENCODER */
            // encodes the string
            if(input == '1')
            {                
               for(int i = 0; i < word.length(); i++)
               {
                   // gets the current letter
                    current = word.substring(i, i+1);
                    
                    // checks to see if current letter is a space
                    if(current.equals(" "))
                    {
                        output += " ";
                    }
                    else if(Character.isUpperCase(word.charAt(i)))
                    {
                        index = letters.indexOf(current.toLowerCase());
                        output = output + enc.substring(index, index+1).toUpperCase();
                    }
                    // checks to see if current letter is a non alpha character
                    else if(!letters.contains(current))
                    {
                        output += current;
                    }
                    else
                    {
                        // finds the position of the current letter on 'letters'
                        index = letters.indexOf(current);
                        // gets the letter of same index from "letters" to "enc"
                        output = output + enc.substring(index, index+1);
                    }
                }
            }
            /* END - ENCODER */
        
            
            /* DECODER */
            // decodes the string
           if(input == '2')
            {                
               for(int i = 0; i < word.length(); i++)
               {
                   // gets the current letter
                    current = word.substring(i, i+1);
                    
                    // checks to see if current letter is a space
                    if(current.equals(" "))
                    {
                        output += " ";
                    }
                    else if(Character.isUpperCase(word.charAt(i)))
                    {
                        index = enc.indexOf(current.toLowerCase());
                        output = output + letters.substring(index, index+1).toUpperCase();
                    }
                    // checks to see if current letter is a non alpha character
                    else if(!letters.contains(current))
                    {
                        output += current;
                    }
                    else
                    {
                        // finds the position of the current letter on 'letters'
                        index = enc.indexOf(current);
                        // gets the letter of same index from "letters" to "enc"
                        output = output + letters.substring(index, index+1);
                    }
                }
            }
            /* END - DECODER */
            
            /* OUTPUT */
            System.out.println(output);
            
            // resets variables
            System.out.println("Enter 1 to encode, 2 to decode, 3 to quit: ");
            input = scan.nextLine().charAt(0);
        
            output = "";
        }
    }
}
