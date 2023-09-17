/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio7 {


    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        final int peso1=40;
        final int peso2=60;
        
        System.out.println("Cálculo de la segunda nota necesaria para obtener promedio deseado\n-------------------------------------------------------------------");
        System.out.print("Ingrese nota del primer examen: ");
        double nota1=Double.parseDouble(br.readLine());
        System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
        double promedio=Double.parseDouble(br.readLine());
        
        double nota2=(100*promedio-nota1*peso1)/peso2;
        
        System.out.print("Para tener un "+promedio+ " en el trimestre necesitas sacar un "+Math.round((nota2)*100.0)/100.0+ " en el segundo examen.");
        
        
        
    }
    
}
