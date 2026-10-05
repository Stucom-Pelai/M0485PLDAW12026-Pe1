/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_hoy;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        double tarifa = 35;
        double alquilercoche = 42.75;
        int dias =random.nextInt(5)+15;
        
        double precio = alquilercoche + tarifa;
        System.out.println("el precio del coche es " + precio * dias);
        

    }

}
