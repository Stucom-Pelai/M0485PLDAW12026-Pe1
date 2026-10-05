
package examen1_prog_g_m;

public class Ej3 {


    public static void main(String[] args) {
     
        double price = 42.75;
        double tariff = 35;
        int days = 1 + (int)(Math.random() * 15);
        double total = (price*days)+tariff;
        System.out.println("The total price is: "+total);
        System.out.println(days);
    }
    
}
