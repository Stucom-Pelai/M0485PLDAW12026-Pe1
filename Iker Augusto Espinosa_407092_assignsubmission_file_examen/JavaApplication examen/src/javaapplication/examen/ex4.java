/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.examen;

import java.util.Scanner;

/**
 *
 * @author iker
 */
public class ex4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int economico=1;
        int ejecutivo=2;
        int independencia=3;
        int valor= scanner.nextInt();
        int categoriavehiculo=valor;
        boolean contratofirmado=true;
        boolean resultado= ((economico==categoriavehiculo)||(ejecutivo==categoriavehiculo) || (independencia==categoriavehiculo))&& contratofirmado;
        System.out.println("Tue selección es:"+resultado);
    }
    
}
