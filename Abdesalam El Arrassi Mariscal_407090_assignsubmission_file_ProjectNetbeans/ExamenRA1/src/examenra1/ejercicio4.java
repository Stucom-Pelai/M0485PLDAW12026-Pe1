/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenra1;

import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("chose between three types of vehicles: Economic(1),Executive(2) or Independency(3) ");
        int vehicleCategory = sc.nextInt();
        boolean contractSigned = true;
                
        boolean chosed = (vehicleCategory == 1 || vehicleCategory == 2 || vehicleCategory == 3);
        System.out.println("you choose this option: "+ vehicleCategory+ " and is it signed: " + contractSigned+ " that means it is: " + chosed );
         
//        System.out.println(finPrice);
        
        
        
        
        
    }
    
}
