package main.java.prog1_Examen;

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Actividad3Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        
        double precioestudiante = 28.50;
        int numeroestudiantes = scanner.nextInt();
        double fija = 40;
        System.out.println((precioestudiante * numeroestudiantes) + fija);
        
    }
}
