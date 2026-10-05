/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_programación;
import java.util.Random;

/**
 *
 * @author sabag
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        // TODO code application logic here
        double precioDiario = 42.75;
        double duracionAlquiler = random.nextInt(11) + 5;
        double gestionFija = 35;
        
        System.out.println("Duración del alquiler: " + duracionAlquiler);
        
        double sum = precioDiario * duracionAlquiler;
        double costeTotal = sum + gestionFija;
        System.out.println("Total del alquiler del vehículo: " + costeTotal);
    }
    
}
