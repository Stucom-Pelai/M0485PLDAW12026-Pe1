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
public class Ex5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        
        System.out.println ("Gasto del primer alquiler: ");
        int alq1 = scanner.nextInt();
        System.out.println ("Gasto del segundo alquiler: ");
        int alq2 = scanner.nextInt();
        System.out.println ("Gasto del tercer alquiler: ");
        int alq3 = scanner.nextInt();
        
        int suma = alq1 + alq2 + alq3;
        double media = suma / 3.0;
        
        boolean superaLimite = suma > 600;
        boolean contratoFirmado = true;
        boolean sinMultas = true;
        
        boolean resultado = superaLimite && contratoFirmado && sinMultas;
        System.out.printf(Locale.US, "Media del gasto total: %.2f euros \n",media );
        System.out.println ("El cliente puede realizar nuevas reservas (supera li1mite y contrato firmado y sin multas): " + resultado );
        
        
        
        }
    
}
