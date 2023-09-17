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


public class Ejercicio17 {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         List<Double> lista=new ArrayList<>();
        double sumImp=0;
        int cantImp=0;
        double mayPar=0;
        double num;
        System.out.println("Ingresar números\n----------------");
        do{
            System.out.print("Ingrese un número: ");
            num=Double.parseDouble(br.readLine());
            if(num>0){
                lista.add(num);
            }
        }
        while(num>=0);
        for(int i=0;i<lista.size();i++){
            if(lista.get(i)%2>0){
                cantImp++;
                sumImp=sumImp+lista.get(i);
            }
            else{
                if(lista.get(i)>mayPar){
                    mayPar=lista.get(i);
                }
            }
        }
        System.out.println("\nReporte\n-------");
        System.out.println("Cantidad de números introducidos: "+lista.size());
        System.out.println("Media de los impares: "+(double)sumImp/cantImp);
        System.out.println("Mayor de los pares: "+mayPar);        
        
    }
}
