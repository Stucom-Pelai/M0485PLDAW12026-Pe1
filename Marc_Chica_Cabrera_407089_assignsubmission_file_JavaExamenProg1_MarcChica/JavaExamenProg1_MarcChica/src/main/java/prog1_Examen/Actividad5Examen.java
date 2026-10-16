package main.java.prog1_Examen;

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Actividad5Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();

        double visita1 = scanner.nextDouble();
        double visita2 = scanner.nextDouble();
        double visita3 = scanner.nextDouble();

        double gastototal = visita1 + visita2 + visita3;
        double media = (visita1 + visita2 + visita3) / 3;

        boolean superalimite = gastototal > 150;
        boolean pasevigente = true;
        boolean sindeudas = true;
        
        System.out.println"El cliente puede acceder sin restricciones " superalimite && pasevigente && sindeudas;
        System.out.println("La seleccion es valida " + total);

    }
}
