/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio5 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int horTrab;
        final int pagHor=12;
        
        System.out.println("Calculador de Salario Semanal\n------------------------------");
        System.out.print("Ingrese horas trabajadas: ");
        horTrab=Integer.parseInt(br.readLine());
        
        System.out.print("Salario semanal (en Euros): "+horTrab*pagHor);
        
    }
    
}
