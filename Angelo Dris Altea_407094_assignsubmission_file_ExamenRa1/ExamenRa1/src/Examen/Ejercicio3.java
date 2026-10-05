/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
import java.util.Random;
import java.util.Locale;


/**
 *
 * @author nooba
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        
        //Precio diario alquiler
        double pdiario = 42.75;
        
        
        //Tarifa fija
        int gfija = 35;
        
        
        //Duracion alquiler 11,5
        int drandom = random.nextInt(11)+5;
        
        //Calculo
        double Precio = pdiario * drandom;
        double Ptotal = Precio + gfija;
        
        //Output
        System.out.printf(Locale.US, "EL total para alquilar el coche durante " + drandom + " dias:" + " %.2f euros. ", Ptotal);
        
    }
}
