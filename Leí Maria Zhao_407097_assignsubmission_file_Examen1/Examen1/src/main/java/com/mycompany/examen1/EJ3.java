/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lzhao
 */
public class EJ3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        int aleatorio = random.nextInt(10) + 5;
        double alquiler = 42.75;
        double extra = 35;
        double preciototal = (aleatorio * alquiler) +35;
        System.out.println("El número de días que alquilaste el coche:" + aleatorio);
        System.out.printf(Locale.US,"El precio final: %.2f%n", preciototal);
    }
}
