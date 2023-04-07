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
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ingrese el primer numero ");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        System.out.println("ingrese el segundo numero ");
        int num2 = leer.nextInt();
        {
        if (num1> 25 && num2> 25)
        {
        System.out.println("ambos numeros son mayores que 25");
        }
        else if (num1>25 || num2>25){
            System.out.println(" al menos uno es mayor a 25");
                     
                } 
        else {
                System.out.println("los numeros son menores a 25");
                }
        }
    }
}
        
        
        
  
