/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author aarkr
 */
public class Hola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double alquiler = (double) (a * 0.21);
        
                
        System.out.println("El IVA aplicado es de un " + alquiler + "€");
      
        
        // TODO code application logic here
    }
    
}
