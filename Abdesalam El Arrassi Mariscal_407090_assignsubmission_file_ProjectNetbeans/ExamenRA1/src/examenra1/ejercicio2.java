/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra1;

import java.util.Locale;

public class ejercicio2 {

  
    public static void main(String[] args) {
        double sterlinPounds = 0.86;
        double alquiler = 200;
        double discount = 8;
        
        
        double change  = (alquiler * sterlinPounds) - discount;
        
        System.out.printf(Locale.US," %.2f\n", change);
//        System.out.println(change);
    }
    
}
