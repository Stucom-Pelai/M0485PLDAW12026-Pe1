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
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double prima = 200;
        double descuento = 8;
        double cambio = 0.86;
        
        double libras = prima * cambio;
        double tarifad = libras - descuento;
        System.out.println("el coste de tu coche es de " + libras );
        System.out.println("y el precio con el descuento es de" + tarifad );
    }

}
