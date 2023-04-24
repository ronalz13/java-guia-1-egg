/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 * @author ronald
 */
public class ejercicio7 {
    public static void main(String[] args) {
        
        System.out.println("ingrese la frase que desea comprobar");
        
        Scanner leer= new Scanner(System.in);
        
        String frase= leer.nextLine();
        
        if (frase.equals("eureka")){
        System.out.println("correto");
        }
        else {
            System.out.println("incorrecto");
        }
        
    }
        
        
        
    }
      

