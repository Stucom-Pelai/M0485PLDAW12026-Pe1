/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lzhao
 */
public class EJ5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Introduzca su precio tres veces:");
        double num = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = num + num2 + num3;
        double nummedia = num4 / 3;
        System.out.println("Su precio promedio durante tres veces es:" + nummedia);
        boolean superaLimite = num4 > 600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean fin = superaLimite && (contratoFirmado && sinMultas);
        System.out.println("El cliente puede realizar nuevas reservas supera límite y contrato firmado y sin multas:" + fin);
     }
}
