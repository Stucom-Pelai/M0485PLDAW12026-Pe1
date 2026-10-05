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
public class JavaExamen5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double alquiler1 = scanner.nextDouble();
    double alquiler2 = scanner.nextDouble();
    double alquiler3 = scanner.nextDouble();
    
    double suma = alquiler1 + alquiler2 + alquiler3;
    double mediana = (alquiler1 + alquiler2 + alquiler3) / 3;
    boolean superaLimite = suma < 600.00;
    boolean contratoFirmado = true;
    boolean sinMultas = true;
    
    boolean contratoValido = superaLimite && contratoFirmado && sinMultas;
    
    System.out.println("La mediana es: " + mediana);
    System.out.println("El cliente puede realizar nuevas reservas : " + contratoValido);
    }   
}
