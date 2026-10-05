/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_programación;

/**
 *
 * @author sabag
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double euros = 200;
        double cambio = 0.86;
        double tarifaDescuento = 8;
        
        double costeAlquiler = euros * cambio;
        double descuentoCorporativo = costeAlquiler - tarifaDescuento;
        
        System.out.println("El cambio a libras esterlinas es de: " + descuentoCorporativo);
    }
    
}
