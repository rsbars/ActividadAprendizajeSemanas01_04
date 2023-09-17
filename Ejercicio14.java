/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio14 {

    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         int hor=-1, min=-1, horFalt=0, minFalt=0, diaFalt=0;
         int opc=-1;
         
        System.out.println("Cálculo de minutos para llegar a fin de semana\n-----------------------------------------------");
        while(opc==-1){
            System.out.println("\nSeleccione un número de día de la Semana\n-----------------------------------------");
            System.out.println("1. Lunes");
            System.out.println("2. Martes");
            System.out.println("3. Miércoles");
            System.out.println("4. Jueves");
            System.out.println("5. Viernes");
            System.out.println("6. Sábado");
            System.out.println("7. Domingo");
            System.out.println("-----------------------------------------");
            System.out.print("Ingrese opción (1-7): ");
            opc=Integer.parseInt(br.readLine());
        }
        if(opc!=6&&opc!=7){
            while(hor<0||hor>23||min<0||min>59){
                System.out.print("\nIngrese hora en el formato hh:mm o h:mm de 24 horas => ");
                String cad = br.readLine();
                String[] sep = cad.split(":");
                hor=Integer.parseInt(sep[0]);
                min=Integer.parseInt(sep[1]);
            }
        }
        if(hor>=15&&min==0&&opc==5){
            diaFalt=0;
            horFalt=0;
            minFalt=0;
        }else{
            if(opc==6||opc==7){
                diaFalt=0;
                horFalt=0;
                minFalt=0;
            }else if(opc==5&&hor<15){
                diaFalt=0;
                horFalt=14-hor;
                minFalt=60-min;
            }else{
                diaFalt=5-opc;
                horFalt=14-hor;
                minFalt=60-min;
            }
        }
        System.out.println("\nCantidad de minutos que faltan: "+(diaFalt*1440+horFalt*60+minFalt));
       
    }

}
