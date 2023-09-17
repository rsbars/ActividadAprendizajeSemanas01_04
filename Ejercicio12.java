/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio12 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Ingrese un número entero: ");
        int n=Integer.parseInt(br.readLine());
        
        if(n%2==0&&n%5==0){
            System.out.print("El número "+n+" es par y divisible entre 5.");
        }else if(n%2==0){
            System.out.print("El número "+n+" es par.");
        }else if(n%5==0){
            System.out.print("El número "+n+" es divisible entre 5.");
        }else{
            if(n%2!=0&&n%5!=0){
                System.out.print("El número "+n+" es impar y no es divisible entre 5.");
            }else if(n%2!=0){
            System.out.print("El número "+n+" es impar.");
            }else if(n%5==0){
            System.out.print("El número "+n+" no es divisible entre 5.");
            }
        }
    }
}
