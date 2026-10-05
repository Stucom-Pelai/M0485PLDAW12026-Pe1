/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_programación;

/**
 *
 * @author sabag
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double basePrice = 95;
        double iva = 0.21;
        
        double finalPrice = basePrice * (1 + iva);
        System.out.println("El precio final de un alquiler del vehículo es de: " + finalPrice);
    }
    
}
