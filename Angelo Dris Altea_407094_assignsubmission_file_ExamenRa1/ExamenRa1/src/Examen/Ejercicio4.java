/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen;
import java.util.Scanner;



/**
 *
 * @author nooba
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Categorias vehiculo
        System.out.println("Has de elegir tres categorias:");
        int cat = scanner.nextInt();
        
        
        
        //Contrato (true)
        boolean Cfirmado = true;
        
        
        //Almacenar
        boolean categoriaVehiculo = cat == 1 || cat == 2 || cat == 3;
        boolean validacion = categoriaVehiculo && Cfirmado;
        
        //Output
        System.out.println("La el valor seleccionado es: " + validacion);
        
    }
    
    
}
