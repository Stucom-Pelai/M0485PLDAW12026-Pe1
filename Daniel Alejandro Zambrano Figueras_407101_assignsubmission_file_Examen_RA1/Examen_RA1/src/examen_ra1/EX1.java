/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_ra1;

import java.util.Scanner;

/**
 *
 * @author DAZ
 */
public class EX1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    double precio_base = 95;
    int impuesto = 21;
    
    double precio = precio_base * 0.21;
    double precio_final = precio_base + precio;
    
    System.out.println("El precio final del vehiculo es: " + precio_final + " euros");
   
        // TODO code application logic here
    }
    
}
