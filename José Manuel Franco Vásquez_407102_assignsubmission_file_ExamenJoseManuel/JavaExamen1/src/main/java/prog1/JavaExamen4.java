package main.java.prog1;

import java.util.Random;
import java.util.Scanner;

/**
 * <div class="block">
 * <strong>Generate random numbers with Random and increments
 * operator</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P45_WeeklySales.png"/>
 * </div>
 */
public class JavaExamen4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int categoriaVehiculo = scanner.nextInt();
    
    boolean economico = categoriaVehiculo >= 1; 
    boolean ejecutivo = categoriaVehiculo <= 2; 
    boolean independencia = categoriaVehiculo <= 3; 
    
    boolean contratoFirmado = true;
    boolean contratoValido = economico || ejecutivo || independencia && contratoFirmado;
        
    System.out.println("La seleccion  es valida: " + contratoValido);
    
//     int age = scanner.nextInt();
//     boolean Ban = scanner.nextBoolean();
//        
//     boolean allowedAge = age > MIN_AGE;
//     boolean result = !Ban && allowedAge;
//        
//     System.out.println(result);        
         
    }   
}
