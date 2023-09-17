/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio15 {

    public static void main(String[] args) throws IOException {
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         final String com="0342";
         
        int cant=0;
        String cnum;
        int num;
        int cont=0;
        
        System.out.println("Acceso a la caja fuerte\n------------------------");
        
        while(cant!=4||cont<4){
            System.out.print("Ingrese la combinación de 4 cifras: ");
            cnum=br.readLine();
            cant=cnum.length();
            num=Integer.parseInt(cnum);
            if(cant==4){
                if(!cnum.equalsIgnoreCase(com)){
                    cont++;
                    if(4-cont==0){
                        System.out.println("Lo siento, esa no es la combinación. Se bloqueó el acceso por 30 minutos.");
                    }else{
                        System.out.println("Lo siento, esa no es la combinación. Te quedan "+(4-cont)+" intentos.");
                    }
                }else{
                    System.out.println("¡La caja fuerte se ha abierto satisfactoriamente!");
                    cont=4;
                }
            }
        }
    
    }
}
