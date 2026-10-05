/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class p01 {
    
   

public static void main(String[] args) {


    
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        double alquilerbase = 95.00;
        double finalPrice = alquilerbase * 1.21; 

        System.out.printf(Locale.US, "Precio final del alquiler: %.2f%n", finalPrice); 
        
        scanner.close(); 
    
        
        
    }
   
   
 
    
}
