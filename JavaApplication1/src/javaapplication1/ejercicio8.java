/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author king_
 */
public class ejercicio8 {
    public static void main(String[] args){
        System.out.println("ingrese 4 numeros comprendidos entre 1 y 20");
        Scanner leer = new Scanner(System.in);
        
        int num = leer.nextInt();
        
        if  (num>= 1 && num<=20); {
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(+num +"*");
            }
            
        }
        
    }
        
        
                
        
    }
}
