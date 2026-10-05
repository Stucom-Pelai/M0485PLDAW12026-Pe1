/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author aarkr
 */
public class ejercicio3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 
        System.out.println("Indique el precio del alquiler: ");
        Random random = new Random();
        double price = scanner.nextDouble();
        int gestión = 35;
        
        
        int dias = random.nextInt(5, 15);
        double preciofinal = price * dias + gestión;
        
        System.out.println(" Dias: " + dias);
        
        System.out.printf(Locale.US, " Precio con gestión incluida de 35€ : %.2f\n", preciofinal);
        
        scanner.close();
         
         
    }
    
}

