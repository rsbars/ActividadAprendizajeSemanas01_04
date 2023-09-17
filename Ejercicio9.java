/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         int horTrab;
         
        System.out.println("Cálculo del Salario Semanal\n----------------------------");
        System.out.print("Ingrese cantidad de horas semanales trabajadas: ");
        horTrab=Integer.parseInt(br.readLine());
        
        if(horTrab>=0&&horTrab<=40){
            System.out.print("Salario semanal: "+horTrab*12);
        }else if(horTrab>=41&&horTrab<168){
            System.out.print("Salario semanal: "+horTrab*16);
        }else{
            System.out.print("Error. Cantidad de horas trabajadas inválida.");
        }
    }
}
