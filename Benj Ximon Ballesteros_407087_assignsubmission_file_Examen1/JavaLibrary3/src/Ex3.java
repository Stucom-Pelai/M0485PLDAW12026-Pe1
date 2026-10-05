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
public class Ex3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        
        double precio_diario =  42.75;
        int duracion_alquiler = random.nextInt(11) + 5;
        double tarifa_fija = 35.00;
        
        double resultado = duracion_alquiler * precio_diario + tarifa_fija;
        System.out.println("Duracion:" + duracion_alquiler + " dias");
        System.out.printf(Locale.US, "Precio total: %.2f euros \n",resultado );
        
        
        }
}
