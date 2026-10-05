/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 7nmoy
 */
public class P04_Category {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // System output
        System.out.println("Hello, Welcome to S&A Cars! Have you signed the previous contract? \n Please reply with (true) or (false)");
        
        // User input 
        boolean signedContract = scanner.nextBoolean();
        
        // System output 
        System.out.println("Thanks! Please choose your vechicle. \n Economic(1) Executive(2) Independent(3) (must use the numbers to state desired kind.)");
        int carCategory = scanner.nextInt();
        
        boolean finalChoice = ((carCategory == 1) || (carCategory == 2) || (carCategory == 3) && (signedContract));
        
        System.out.println("Your choice is: " + finalChoice);
         
         // System.out.println(days);
    }
}
