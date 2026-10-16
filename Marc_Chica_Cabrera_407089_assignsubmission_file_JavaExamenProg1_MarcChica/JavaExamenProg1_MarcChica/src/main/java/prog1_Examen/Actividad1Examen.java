package main.java.prog1_Examen;

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Actividad1Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        
        double preciofinal = 42.00 * 1.21;
        System.out.println(preciofinal);

    }
}
