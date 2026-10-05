/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_ethan;

import java.util.Scanner;

/**
 *
 * @author ETHAN
 */
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int alquiler_1 = scanner.nextInt();
        int alquiler_2 = scanner.nextInt();
        int alquiler_3 = scanner.nextInt();
        int total = alquiler_1 + alquiler_2 + alquiler_3;
        boolean SuperaLimite = total > 600;
        boolean ContratoFirmado = true;
        boolean SinMultas = true;
        boolean resultado = SinMultas && SuperaLimite && ContratoFirmado;
        System.out.println("El cliente puede realizar nuevas reservas (supera limite y contrato firmado y sin multas): " + resultado );
    }
    
}
