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
public class EJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double cambio = 0.86;
        double euro = 200;
        double extra = 8;
        double preciototal = (cambio * euro) - extra;
        System.out.printf(Locale.US,"El precio final: %.2f%n", preciototal);
    }
}
