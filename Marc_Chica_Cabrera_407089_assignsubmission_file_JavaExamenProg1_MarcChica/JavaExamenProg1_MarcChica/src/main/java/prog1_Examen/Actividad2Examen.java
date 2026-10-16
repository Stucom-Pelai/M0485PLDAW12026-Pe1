package main.java.prog1_Examen;

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Actividad2Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        
        double cambioactual = 1.12;
        double tarifaactual = 3;
        double total = (cambioactual * 85) - tarifaactual;
        
        System.out.println(total);
    }
}
