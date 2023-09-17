/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio16 {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         List<Double> lista=new ArrayList<>();
        int cantPos=0;
        int cantNeg=0;
        double num;
        System.out.println("Ingresar 10 números\n-------------------");
        for(int i=0; i<10; i++){
            System.out.print("Ingrese número de posición "+(i+1)+": ");
            num=Double.parseDouble(br.readLine());
            lista.add(num);
        }
        for(int i=0;i<lista.size();i++){
            if(lista.get(i)<0){
                cantNeg++;
            }
            else{
                cantPos++;
            }
        }
        System.out.println("\nReporte\n-------");
        System.out.println("Cantidad de números positivos: "+cantPos);
        System.out.println("Cantidad de números negativos: "+cantNeg);        
        
    }
}
