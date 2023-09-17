/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio6 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        final int factor=1000;
        
        System.out.println("Conversor Mb a Kb\n------------------");
        System.out.print("Ingrese peso en Mb: ");
        double peso=Double.parseDouble(br.readLine());
        
        System.out.print("Peso convertido a Kb: "+Math.round((peso*factor)*100.0)/100.0);
        
        
        
    }
    
}
