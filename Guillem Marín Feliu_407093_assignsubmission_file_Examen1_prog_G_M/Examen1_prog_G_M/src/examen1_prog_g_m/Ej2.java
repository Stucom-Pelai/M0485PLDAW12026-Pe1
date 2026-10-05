
package examen1_prog_g_m;

public class Ej2 {

    public static void main(String[] args) {
   
     double price = 200;
     double conversion = price*0.86;
     double totalnoTax = price+conversion;
     double totalwithTax = totalnoTax+8;
     System.out.println("The total price in pounds is: "+totalwithTax);
        
    }
    
}
