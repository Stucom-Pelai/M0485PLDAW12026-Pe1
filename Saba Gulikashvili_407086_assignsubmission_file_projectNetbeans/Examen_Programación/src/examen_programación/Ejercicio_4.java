/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_programación;

import java.util.Scanner;

/**
 *
 * @author sabag
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here
        int economico = 1;
        int ejecutivo = 2;
        int independencia = 3;
        System.out.println("Selecciona una categoría: (1=Económico, 2=Ejecutivo, 3=Independencia");
        int categoriaVehículo = scanner.nextInt();
        
        boolean contratoFirmado = true;
        boolean seleccionValida = categoriaVehículo == 1 || categoriaVehículo == 2 || categoriaVehículo == 3 && contratoFirmado;
        
        System.out.println("La selección es: " + (seleccionValida ? "válida" : "no válida"));
    }
    
}
