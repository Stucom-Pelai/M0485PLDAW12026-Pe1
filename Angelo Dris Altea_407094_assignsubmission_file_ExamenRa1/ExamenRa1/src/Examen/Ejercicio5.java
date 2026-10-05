/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
import java.util.Scanner;
import java.util.Locale;


/**
 *
 * @author nooba
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     //Alquileres
     int alq1 = scanner.nextInt();
     int alq2 = scanner.nextInt();
     int alq3 = scanner.nextInt();
        
     //Media calc
     int avg = (alq1 + alq2 + alq3/3);
        System.out.println("La media calculada de los 3 alquileres: " + avg); 
        
        
        //Suma
        int Prectotal = alq1 + alq2 +alq3;
        
        //Variables
        boolean limit = Prectotal>600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean reservas = limit && contratoFirmado && sinMultas;
        
        
        //Output
        System.out.println("El cliente puede realizar nuevas reservas: " + reservas);
    }
}
