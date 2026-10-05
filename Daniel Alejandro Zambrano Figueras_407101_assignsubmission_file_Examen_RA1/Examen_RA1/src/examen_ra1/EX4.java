/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ra1;

import java.util.Scanner;

/**
 *
 * @author DAZ
 */
public class EX4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Escoja categoria de vehiculo: ");
    
    int Economico = 1;
    int Ejecutivo = 2;
    int Independencia = 3;
    
    int categoriaVehiculo = scanner.nextInt();
    
    boolean valida = (categoriaVehiculo == Economico) || (categoriaVehiculo == Ejecutivo) || (categoriaVehiculo == Independencia);
    boolean contrato = true;
    
    boolean valida_final = valida && contrato;
    
    System.out.println("El servicio es valido: " + valida_final);
    }
}
