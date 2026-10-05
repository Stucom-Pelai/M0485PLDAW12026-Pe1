/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ethan;
import java.util.Random;
/**
 *
 * @author ETHAN
 */
public class ex3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random = new Random();
        
        int dias = random.nextInt(11)+5;
        double alquiler = dias * 42.75;
        double total = alquiler + 35.00;
        System.out.println(total);
    }
    
}
