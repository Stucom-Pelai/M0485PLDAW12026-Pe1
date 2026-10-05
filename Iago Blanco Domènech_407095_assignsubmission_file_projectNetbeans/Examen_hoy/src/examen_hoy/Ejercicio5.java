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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("pon el precio del primer alquiler");
        double alquiler1 = scanner.nextDouble();
        System.out.println("Pon el precio del segundo alquiler");
        double alquiler2 = scanner.nextDouble();
        System.out.println("Pon el precio del tercer alquiler");
        double alquiler3 = scanner.nextDouble();
        double suma = alquiler1+alquiler2+alquiler3;
        double average = (alquiler1+alquiler2+alquiler3) /3.0;
        boolean superalimite = (suma>600);
        boolean contratofirmado =true;
        boolean sinmultas =true;
        boolean todo = superalimite||contratofirmado||sinmultas;
        System.out.println("El cliente puede realizar reservas supera limite y contrato firmado y sin multas " + todo);
    }

}
