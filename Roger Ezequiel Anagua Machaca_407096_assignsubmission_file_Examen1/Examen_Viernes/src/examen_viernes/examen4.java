/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_viernes;

import java.util.Scanner;

/**
 *
 * @author roger
 */
public class examen4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int car = scanner.nextInt();
        int econom = 1;
        int execut = 2;
        int indepent = 3;
        boolean firma = true;
        
        boolean okay = car == econom  ;
        boolean  okay2 = car == execut ;
        boolean okay3 = car == indepent; 
        boolean Valid = okay == true || okay2 == true || okay3 ==true && firma == true;       
         System.out.println( "econom " + okay +"\n" + "execut " + okay2+ "\n"+ "indepent " + okay3+ "\n"+ "FIRMA "+firma+ "\n Can drive =" + Valid);
         
     
        
        // TODO code application logic here
    }
}
