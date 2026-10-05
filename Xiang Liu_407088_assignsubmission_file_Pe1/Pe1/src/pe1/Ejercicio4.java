/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe1;
import java.util.Scanner;
/**
 *
 * @author xiang
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Elige tu categoría de vehículo: Económico(1), Ejecutivo(2), Independencia(3)");
        int categoriaVehiculo = scan.nextInt();
        boolean valida = (categoriaVehiculo == 1) || (categoriaVehiculo == 2) || (categoriaVehiculo == 3);
        boolean confirmado = true;
        boolean contrato = (valida && confirmado);
        System.out.println("Categoria de Vehiculo valida: " + valida);
        System.out.println("Contrato confirmado: " + contrato);
    }
    
}
