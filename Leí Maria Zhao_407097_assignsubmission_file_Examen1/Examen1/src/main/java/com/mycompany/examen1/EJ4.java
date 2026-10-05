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
public class EJ4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Por favor, seleccione una opción Económico(1), Ejecutivo(2), Independencia(3):");
        int num4 = scanner.nextInt();
        int num = 1;
        int num2 = 2;
        int num3 = 3;
        boolean firmado = true;
        boolean categoriaVehiculo = (num4 == num ) || (num4 == num2 ) || (num4 == num3 );
        boolean fi = categoriaVehiculo == firmado;
        System.out.println("El número de días que alquilaste el coche:" + fi);
 
    }
}
