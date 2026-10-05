/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pe1;
import java.util.Random;
/**
 *
 * @author xiang
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        double precioDia = 42.75;
        int dia = random.nextInt(10) + 5;
        int tarifa = 35;
        double res = (precioDia * dia) + 35;
        System.out.println("Diass de alquiler: " + dia);
        System.out.println("Precio total de alquiler: " + res);
    }
    
}
