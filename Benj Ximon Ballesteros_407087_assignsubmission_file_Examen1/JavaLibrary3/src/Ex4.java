/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author User
 */
public class Ex4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
       
        int economico = 1;
        int ejecutivo = 2;
        int independencia = 3;
        boolean firmado = true;
        
        
        System.out.println ("Introduce categoria de vehiculo: ");
        int categoriaVehiculo = scanner.nextInt();
        boolean resultado = categoriaVehiculo == economico || categoriaVehiculo == ejecutivo || categoriaVehiculo == independencia && firmado;
        
        System.out.println ("Eleccion valida: " + resultado );
        }
    
}
