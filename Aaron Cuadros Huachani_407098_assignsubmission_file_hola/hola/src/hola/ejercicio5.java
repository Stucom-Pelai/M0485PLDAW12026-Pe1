/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola;

import java.util.Scanner;

/**
 *
 * @author aarkr
 */
public class ejercicio5 {
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alquiler 1 ");
        int a = scanner.nextInt();
        System.out.println("Alquiler 2 ");
        int b = scanner.nextInt();
        System.out.println("Alquiler 3 ");
        int c = scanner.nextInt();
        
        
        
        double average = (a+b+c) / 3.0;
        double gastoTotal  = (a+b+c);
        boolean SuperaLimite = (gastoTotal > 600);
        System.out.println("Supera el limite de gastos totales" + SuperaLimite);
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean alert = (SuperaLimite) || (contratoFirmado) || (sinMultas);
        System.out.println("La media calculada " + average);
        System.out.println("El cliente puede realizar nuevas reservas " + alert);
        
        
        
}
}
