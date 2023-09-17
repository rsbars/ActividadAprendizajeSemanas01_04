/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio3 {


    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        final double tipoCambio=166.386;
        
        System.out.println("Conversor de Euros a Pesetas\n-----------------------------");
        System.out.print("Ingrese monto en Euros: ");
        double monto=Double.parseDouble(br.readLine());
        
        System.out.print("Monto convertido a pesetas: "+Math.round((monto*tipoCambio)*1000.0)/1000.0);
    }
    
}
