/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author aarkr
 */
public class ejerc2 {
     public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println(" Ingrese la cantidad de euros ");
                  
        scanner.useLocale(Locale.US);
        double euros = scanner.nextDouble();
       
        double m = euros * 0.86 - 8;
      
        System.out.printf(Locale.US, " Su cambio es: %.2f%n ", + m);
     }
}
