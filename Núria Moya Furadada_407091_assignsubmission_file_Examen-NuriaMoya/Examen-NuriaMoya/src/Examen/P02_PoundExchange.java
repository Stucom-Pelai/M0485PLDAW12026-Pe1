/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;

import java.util.Locale;

/**
 *
 * @author 7nmoy
 */
public class P02_PoundExchange {
        public static void main(String[] args) {
            
        // Pound Exchange, data def.
        double pounds = 0.86;
        double rent = 200;
        int commission = 8;
        
        double exchange = rent * pounds;
        double exchangeCom = exchange - commission;
        
        // Output
         System.out.printf(Locale.US, "Your total comes to (without commission): €%.2f%n", exchange);
         System.out.printf(Locale.US, "Including our commission fee of 8 euros: €%.2f%n", exchangeCom);
    
    }
}
