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
public class P05_ConsecutiveRent {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Input your requests: ");
        // User Input
        double rent1 = scanner.nextDouble();
        double rent2 = scanner.nextDouble();
        double rent3 = scanner.nextDouble();
        
       // System output + System input 
        System.out.println("Hello. Welcome to S&A Company, before validating your reservations please answer following questions. \n Have you signed previous contract? Must reply with (true) or (false)");
        boolean signedContract = scanner.nextBoolean();
        
        System.out.println("Thanks! Last one, are you toy-free? \n Must reply with (true) or (false)");
        boolean toyFree = scanner.nextBoolean();
        
        // Operations & More Variables
        double rentTotal = rent1 + rent2 + rent3;
        double rentAvg = rentTotal / 3;
        
        boolean maxLimit = rentTotal > 600;
        boolean approved = (maxLimit) && (signedContract) && (toyFree);
        
        // Final Output
        System.out.printf(Locale.US, "Average was: €%.2f%n",rentAvg);
        System.out.println("You can make new reservations: " + approved);
    }
}
