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
public class Ex2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        Random random = new Random();
        
        double libras = 0.86;
        double euros = 200.00;
        int descuento = 8;
        
        double resultado = euros * libras - descuento;
        System.out.printf(Locale.US, "Coste total: %.2f libras esterlinas \n",resultado );
        
        }
    
}
