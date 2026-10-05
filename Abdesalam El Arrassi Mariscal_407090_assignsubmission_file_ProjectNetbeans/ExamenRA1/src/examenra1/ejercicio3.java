/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra1;

import java.util.Locale;
import java.util.Random;

public class ejercicio3 {

  
    public static void main(String[] args) {
        Random random = new Random();
        double alquilerDiaryPrice = 42.75;
        double tarifaGestionFija = 35;
        int alquilerDuration = random.nextInt(10) + 6;
        
        
      
        double finPrice =  (alquilerDiaryPrice * alquilerDuration) + tarifaGestionFija;
        
        System.out.printf(Locale.US,"%.2f\n",finPrice);
         
//        System.out.println(finPrice);
        
        
        
        
        
    }
    
}
