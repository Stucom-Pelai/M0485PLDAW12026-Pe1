/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe1;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author xiang
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Precio de alquiler1");
        double num1 = scan.nextDouble();
        System.out.println("Precio de alquiler2");
        double num2 = scan.nextDouble();
        System.out.println("Precio de alquiler3");
        double num3 = scan.nextDouble();
        double suma = (num1 + num2 + num3);
        double media = (suma / 3);
        boolean superaLimite = (suma > 600);
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        boolean reserva = (superaLimite && contratoFirmado && sinMultas);
        System.out.println(String.format(Locale.US, "Media de precio total: %.2f", media));
        System.out.println("El cliente puede realizar nuevas reservas (supera límite y contrato firmado y sin multas): " + reserva);
    }
    
}
