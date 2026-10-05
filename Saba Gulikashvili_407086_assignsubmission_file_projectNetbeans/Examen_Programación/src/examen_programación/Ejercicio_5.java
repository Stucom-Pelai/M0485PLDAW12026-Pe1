/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_programación;

import java.util.Scanner;
/**
 *
 * @author sabag
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Alquiler 1: ");
        double alquiler1 = scanner.nextDouble();
        System.out.println("Alquiler 2: ");
        double alquiler2 = scanner.nextDouble();
        System.out.println("Alquiler 3: ");
        double alquiler3 = scanner.nextDouble();
        double sum = alquiler1 + alquiler2 + alquiler3;
        double media = sum / 3;
        System.out.println("Precio de los 3 alquileres: " + sum);
        System.out.println("Media de los 3 alquileres: " + media);
        
        boolean superaLimite = sum > 600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean finalOperacion = superaLimite && contratoFirmado && sinMultas;
        System.out.println("El cliente puede realizar nuevas reservas: " + finalOperacion);
    }
    
}
