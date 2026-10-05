/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_hoy;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class Examen_hoy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double alquiler = 95.00;
        double resultado = alquiler * 1.21;
        System.out.println("El precio del coche mas el IVA es de " +resultado);

    }

}
