/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio10 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         final double g=9.81;
         
         
        System.out.println("Cálculo del Tiempo de Caída desde una Altura\n---------------------------------------------");
        System.out.print("Ingrese altura (en metros): ");
        double h=Double.parseDouble(br.readLine());
        
       System.out.print("Tiempo de caída: "+Math.round((Math.sqrt(2*h/g))*100.0)/100.0+" segundos.");

    }
}
