package main.java.prog1_Examen;

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Actividad4Examen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        
        int categoriaseleccion = scanner.nextInt();
        
        boolean acceso = categoriaseleccion == 1;
        boolean premium = categoriaseleccion == 2;
        boolean vip = categoriaseleccion == 3;
        
        boolean tipopase = true;
        
        boolean total =(acceso || premium || vip) && tipopase;
        System.out.println("La seleccion es valida " + total);

            
    }
}
