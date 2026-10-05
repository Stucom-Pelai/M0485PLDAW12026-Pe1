/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
import java.util.Locale;

/**
 *
 * @author nooba
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        //Euro a libras
        double Convert = 200 * 0.86; //Libras
        
        //Descuento
        double Total = Convert - 8; // Tarifa de descuento
        
        System.out.printf(Locale.US, "EL total para alquilar el coche serian: %.2f euros. ", Total);
        
    }
}
