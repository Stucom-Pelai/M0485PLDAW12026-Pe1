/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_viernes;

import java.util.Scanner;

/**
 *
 * @author roger
 */
public class examen5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        
        int b = scanner.nextInt();
        
        int c = scanner.nextInt();
         
        int numbersum = (a+b+c);
        int numbers []={a,b,c};
        int length = numbers.length;
        float result = (numbersum / length);
        
        boolean limit = result >600 ;
        boolean firma = true;
        boolean nomultas = true;
        boolean more = limit== false && nomultas ==true && firma == true;
        
                
        System.out.println("Can rent more stuff "+ more);
        // TODO code application logic here
    }
    
}
