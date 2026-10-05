/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ra1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAZ
 */
public class EX3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    
    double alquiler = 42.75;
    int gestion = 35;
    int dias = random.nextInt(11) + 5;
    
    double precio_alquiler = dias * alquiler;
    double precio_final_con_gestion = precio_alquiler + gestion;
    
    System.out.println("Dias: " + dias);
    System.out.println("El precio de alquiler es: " + precio_alquiler + " euros");
    System.out.println("El precio de alquiler mas gestion es: " + precio_final_con_gestion + " euros");
    
    
    
    }
}
