/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase ex
String
 * @author ronald
 */
public class ejercicio3x {
    public static void main(String[] args) {
        System.out.println("deteccion de vocales");
        Scanner leer= new Scanner(System.in);
        
        String letra= leer.next();
        
       
        
        if( (letra.equalsIgnoreCase("a"))||
        (letra.equalsIgnoreCase("e"))||
        (letra.equalsIgnoreCase("i"))||
        (letra.equalsIgnoreCase("o"))||
        (letra.equalsIgnoreCase("u")))
        {System.out.println("la letra ingresada es una vocal");
            
        }
        else{
            System.out.println("la letra ingresada es una consonante");
        }
        
        
        
        
        
    }
            
            
            
            
       
}
