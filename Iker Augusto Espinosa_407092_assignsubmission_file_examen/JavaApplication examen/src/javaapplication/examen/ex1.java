/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.examen;

/**
 *
 * @author iker
 */
public class ex1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double alquilerbase=95.00;
        double iva=0.21;
        double ivaqueañadir=alquilerbase*iva;
        double preciofinal= alquilerbase+ivaqueañadir;
        
        System.out.println(preciofinal+"€");
        
    }
    
}
