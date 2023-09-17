/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio11 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         int hor=-1, min=-1, horFalt=0, minFalt=0;

        System.out.println("Cálculo de segundos para llegar a medianoche\n---------------------------------------------");
        
        while(hor<0||hor>23||min<0||min>59){
            System.out.print("Ingrese hora en el formato hh:mm o h:mm de 24 horas => ");
            String cad = br.readLine();
            String[] sep = cad.split(":");
            hor=Integer.parseInt(sep[0]);
            min=Integer.parseInt(sep[1]);
        }
        if(hor==0&&min==0){
            horFalt=0;
            minFalt=0;
        }else{
            horFalt=23-hor;
            minFalt=60-min;
        }
        System.out.println("Cantidad de segundos que faltan: "+(horFalt*3600+minFalt*60));
       
    }
}
