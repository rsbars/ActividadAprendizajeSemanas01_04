/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ejercicio8 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Saludo según la hora ingresada\n---------------------------------");
        System.out.print("Ingrese una hora (de 0 a 23): ");
        int hora=Integer.parseInt(br.readLine());
        
        if(hora>=0&&hora<=5){
            System.out.print("¡Buenas noches!");
        }else if(hora>=6&&hora<=12){
            System.out.print("¡Buenos días!");
        }else if(hora>=13&&hora<=20){
            System.out.print("¡Buenas tardes!");
        }else if(hora>=21&&hora<=23){
            System.out.print("¡Buenas noches!");
        }else{
            System.out.print("Error. Hora inválida.");
        }
    }
    
}
