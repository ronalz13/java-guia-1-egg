/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author king_
 */
public class ejercicio9 {
     public static void main(String[]args){
        
    Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una frase"); 
        
        String frase= leer.nextLine();
        
        if (frase.substring(0,1).equalsIgnoreCase("a")){
            System.out.println("correcto");
        }
        else{
            System.out.println("incorrecto");
        }
            
        
        
     }
     
}
