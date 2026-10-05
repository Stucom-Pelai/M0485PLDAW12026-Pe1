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
public class P01_CalculateVAT {
        public static void main(String[] args) {
            
        // Rent price & VAT price 
        double rentPrice = 95.00;
        double priceVAT = rentPrice * 1.21; 
        
        // Output
         System.out.printf(Locale.US, "Total price with VAT: €%.2f%n", priceVAT);
    
    }
}
