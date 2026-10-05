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
public class EX5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Introduzca 3 alquileres: ");
    
    int alquiler1 = scanner.nextInt();
    int alquiler2 = scanner.nextInt();
    int alquiler3 = scanner.nextInt();
    
    double media = (alquiler1 + alquiler2 + alquiler3) / 3;
    double suma = alquiler1 + alquiler2 + alquiler3;
    
    boolean superaLimite = suma > 600;
    boolean contratoFirmado = true;
    boolean sinMultas = true;
    
    boolean valida = superaLimite && contratoFirmado && sinMultas;
    
    System.out.println("La media de los alquileres es: " + media);
    System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas): " + valida);
    
    
    }
}
