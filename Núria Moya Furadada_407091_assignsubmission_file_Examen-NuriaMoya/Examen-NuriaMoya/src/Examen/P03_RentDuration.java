/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author 7nmoy
 */
public class P03_RentDuration {
        public static void main(String[] args) {
        Random random = new Random();

            
        // Price, Random num, fixed fee
        double price = 42.75;
        int days = random.nextInt(5, 15); // [1,10]
        int fixedFee = 35;
        
        double priceTotal = price * days;
        double comTotal = priceTotal - fixedFee;
        // double priceTotal = 35 + (price * days) Wanted to do it separately for user transparency.
        
        // Output
         System.out.printf(Locale.US, "Your total comes to (without commission): €%.2f%n", priceTotal);
         System.out.printf(Locale.US, "Including our fixed fee of 35 euros: €%.2f%n", comTotal);
         
         // System.out.println(days);
    }
}
