/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class p05 {
    
    
      public static void main(String[] args) {
        
   Scanner scanner = new Scanner(System.in);
          

    
     
    System.out.println("Primer alquiler:");
        int alquiler1 = Integer.parseInt(scanner.nextLine()); // Lee el primer número entero

        System.out.println("Segundo alquiler:");
        int alquiler2 = Integer.parseInt(scanner.nextLine()); // Lee el segundo número entero

        System.out.println("Tercer alquiler:");
        int alquiler3 = Integer.parseInt(scanner.nextLine()); // Lee el tercer número entero

        int sum = alquiler1 + alquiler2 + alquiler3; // Suma los tres números consecutivos usando el operador (+)

        
     
        boolean superaLimite= sum <600;
        
        System.out.println("El cliente puede realizar nuevas reservas" ); 
    
        System.out.println(superaLimite); 
        
      
    
        
      boolean contratoFirmado = true;
      boolean sinMultas = true;
      
      
      
        scanner.close(); 
   
    }
    
}
