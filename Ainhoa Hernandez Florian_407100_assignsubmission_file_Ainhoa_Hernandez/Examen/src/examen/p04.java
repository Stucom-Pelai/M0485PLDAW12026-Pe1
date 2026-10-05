/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class p04 {
    
    
public static void main(String[] args) {
        
Scanner scanner = new Scanner(System.in);
    
    
    
int  economico= 1;
int ejecutivo= 2;
int independencia= 3;
          
System.out.println("Selecione el vehiculo que desee,seleciones con el teclado el numero corresponiente: economico(1), ejecutivo(2) o independencia(3) ");
    int categoriaVehiculo = Integer.parseInt(scanner.nextLine());
 
 System.out.println("Elegiste el vehiculo "+ categoriaVehiculo);      
        boolean vehiculo = categoriaVehiculo < 4; 
        
        System.out.println(vehiculo); 
        
        scanner.close(); 
   
 
 
        
    }
    
}
