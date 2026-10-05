package main.java.prog1;

import java.util.Random;

/**
 * <div class="block">
 * <strong>Generate random numbers with Random and increments
 * operator</strong><br/>
 * Program to calculate data<br/>
 * <img src="../../../../javadoc/resources/P45_WeeklySales.png"/>
 * </div>
 */
public class JavaExamen3 {
    public static void main(String[] args) {
    Random random = new Random();
    
    int n = random.nextInt(10) + 5;
    
    double finalPrice = (42.75 * n) + 35;
           
    System.out.println(finalPrice);
    }   
}
