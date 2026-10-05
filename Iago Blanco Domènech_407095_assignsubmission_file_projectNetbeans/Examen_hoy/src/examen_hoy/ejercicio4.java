/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_hoy;

import java.util.Scanner;

/**
 *
 * @author blanc
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elije la opcion de coche 1 2 o 3 ");
        System.out.println("1 economico  2 ejecutivo  3 Independecia ");
        int economico = 1;
        int ejecutivo = 2;
        int independencia = 3;
        int categoriaVehiculo = scanner.nextInt();

        boolean esvalido = (categoriaVehiculo == economico) || (categoriaVehiculo == ejecutivo) || (categoriaVehiculo == independencia);
        System.out.println("Tu eleccion es " +esvalido);

    }

}
