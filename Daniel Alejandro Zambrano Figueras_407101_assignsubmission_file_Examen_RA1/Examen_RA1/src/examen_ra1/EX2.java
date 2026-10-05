/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ra1;

import java.util.Scanner;

/**
 *
 * @author DAZ
 */
public class EX2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    double cambio = 0.86;
    double alquiler = 200;
    int descuento = 8;
    
    double precio_libras = alquiler * cambio;
    double precio_final = precio_libras - descuento;
    
    System.out.println("El precio del alquiler es: " + precio_libras + " libras");
    System.out.println("El precio final con descuento es: " + precio_final + " libras");
    
    }
}
