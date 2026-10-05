/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author lzhao
 */
public class Examen1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double base = 95;
        double IVA = 0.21;
        double preciototal = base + (base * IVA);
        System.out.printf(Locale.US,"El precio final: %.2f%n", preciototal);
    }
}
