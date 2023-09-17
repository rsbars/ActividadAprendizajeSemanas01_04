/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio13 {

    public static void main(String[] args) throws IOException {
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cant=0;
        String cnum;
        int num;
        
        while(cant<=0||cant>5){
            System.out.print("Ingrese un número (que tenga entre 1 y 5 dígitos): ");
            cnum=br.readLine();
            cant=cnum.length();
            num=Integer.parseInt(cnum);
            if(cant<=0||cant>5){
            }else{
                System.out.println("La cantidad de dígitos del número "+num+" es: "+cant);
            }
        }
        
    }
    
}
