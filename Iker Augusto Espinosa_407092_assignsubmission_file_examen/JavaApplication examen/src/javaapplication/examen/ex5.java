/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.examen;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class ex5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Intruduce el gasto del primer alquiler:");
        double primeralquiler= scanner.nextDouble();
        System.out.println("Intruduce el gasto del segundo alquiler:");
        double segundolquiler= scanner.nextDouble();
        System.out.println("Intruduce el gasto del tercer alquiler:");
        double tercerlquiler= scanner.nextDouble();
        double sumalquileres= primeralquiler+segundolquiler+tercerlquiler;
        double media=sumalquileres/3;
        System.out.println("La media de los alquileres son:"+media+"€");
        boolean superalimite=sumalquileres>600;
        boolean contratofirmado=true;
        boolean sinmultas=true;
        boolean condicion= superalimite&&contratofirmado&&sinmultas;
        System.out.println("El cliente puede realizar nuevas reservas:"+condicion);
        
        
    }
    
}
