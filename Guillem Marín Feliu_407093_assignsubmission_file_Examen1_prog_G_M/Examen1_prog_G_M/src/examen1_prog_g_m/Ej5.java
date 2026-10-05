
package examen1_prog_g_m;

import java.util.Locale;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("Introduzca el precio de sus ultimos 3 alquileres:");
        double price1 = scanner.nextDouble();
        double price2 = scanner.nextDouble();
        double price3 = scanner.nextDouble();
        double sum= price1+price2+price3;
        double sum1 = sum/3;
        boolean superaLimite = sum<601;
        boolean contratoFirmado = true;
        boolean sinMultas=true;
        boolean hello = (superaLimite=true) || (contratoFirmado=true) || (sinMultas=true); 
        System.out.printf(Locale.US,"La media de sus alquileres es de: "+sum1+"\n");
        System.out.println("El cliente puede realizar nuevas reservas (supera el limite y contrato firmado y sin multas): "+hello);
        
    }
    
}
