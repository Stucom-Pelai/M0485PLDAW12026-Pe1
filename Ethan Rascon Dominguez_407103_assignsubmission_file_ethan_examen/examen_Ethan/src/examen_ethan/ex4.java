/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ethan;
import java.util.Scanner;
/**
 *
 * @author ETHAN
 */
public class ex4 {
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escoge una de las tres opciones que tienes a continuacion:");
        System.out.println("Economico [1], Ejecutivo[2], Independencia [3]");
        int categoriaVehiculo = scanner.nextInt();
        boolean contrato = true;
        boolean valido = categoriaVehiculo == 1 || categoriaVehiculo == 2 || categoriaVehiculo ==3 ;
        boolean total = contrato && valido ;
        System.out.println(total);
        
    }
    
}
