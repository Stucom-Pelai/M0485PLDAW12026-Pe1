
package examen1_prog_g_m;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escoja su categoria de vehiculo, y escriba en consola su numero pertinente");
        System.out.println("Economico(1)");
        System.out.println("Ejecutivo(2)");
        System.out.println("Independencia(3)");
        int categoriaVehiculo = scanner.nextInt();
        boolean valid = categoriaVehiculo<4;
        System.out.println("Your selection is availible: "+valid);
        System.out.println("Ha firmado el contrato? conteste (true) o (false)");
        boolean contract = scanner.nextBoolean();
        System.out.println("Su seleccion de vehiculo es: "+categoriaVehiculo+" "+valid+" y usted a firmado el contrato: "+contract);
        
        
    }
    
}
