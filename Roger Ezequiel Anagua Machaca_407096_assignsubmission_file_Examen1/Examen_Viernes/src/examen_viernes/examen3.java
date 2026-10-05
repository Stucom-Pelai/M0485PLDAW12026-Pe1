/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_viernes;

/**
 *
 * @author roger
 */
public class examen3 {
    public static void main(String[] args) {
        double days = (int) Math.floor((Math.random() * 16) + 5);
        double pc = 42.75;
        double tax = 25;
        double fin =  (days *pc) + tax;
        System.out.println(fin);
        // TODO code application logic here
    }
}
