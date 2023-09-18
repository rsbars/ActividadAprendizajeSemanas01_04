/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio4 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        final double tipoCambio=3.96;
        
        System.out.println("Conversor de Soles a Euros\n---------------------------");
        System.out.print("Ingrese monto en Soles: ");
        double monto=Double.parseDouble(br.readLine());
        
        System.out.print("Monto convertido a euros: "+Math.round((monto/tipoCambio)*100.0)/100.0);
        
        
        
    }
}
