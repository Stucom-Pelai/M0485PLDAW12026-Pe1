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
public class Ex1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        
        double iva = 1.21;
        double base = 95.00;
        double resultado = iva * base;
        
        System.out.printf(Locale.US, "Precio final: %.2f euros \n",resultado );
        
        
        
        }
    
}
