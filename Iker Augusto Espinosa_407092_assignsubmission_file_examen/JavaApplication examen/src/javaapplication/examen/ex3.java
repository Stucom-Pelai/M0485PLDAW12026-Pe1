/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.examen;

import java.util.Random;

/**
 *
 * @author iker
 */
public class ex3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        double preciodia=42.75;
        double gastogestion=35;
        int duracionalquiler = random.nextInt(11)+ 5;
        double diasalquiladosprecio= duracionalquiler*preciodia;
        double resultado= diasalquiladosprecio+gastogestion;
        System.out.println(resultado+"€");
        
    }
    
}
