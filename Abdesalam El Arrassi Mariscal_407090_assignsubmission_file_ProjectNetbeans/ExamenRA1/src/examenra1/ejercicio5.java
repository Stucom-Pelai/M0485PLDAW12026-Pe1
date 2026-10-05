/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra1;

import java.util.Scanner;

public class ejercicio5 {

  
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
     
        double costAlquiler1 = sc.nextDouble();
        double costAlquiler2 = sc.nextDouble();
        double costAlquiler3 = sc.nextDouble();
        boolean contractSigned = true;
        boolean withoutfault = true;
        
        double totalCost = costAlquiler1 + costAlquiler2 + costAlquiler3;
        
        boolean aboveLimit = (totalCost > 600);
        boolean result = aboveLimit && contractSigned && withoutfault;
        System.out.println("The client can do new reservations "+ result);
        
       
     
        
      
       
        
//        System.out.printf(Locale.US,"%.2f\n",finPrice);
         
//        System.out.println(finPrice);
        
        
        
        
        
    }
    
}
