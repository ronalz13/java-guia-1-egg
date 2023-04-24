/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.
 * @author ronald
 */
public class ejercicio10 {
    public static void main(String[] args) {
        System.out.println("ingrse el valor del limmite positvo");
        Scanner leer= new Scanner(System.in);
        int limite = leer.nextInt();
        
        int suma=0;
                
        do {
            System.out.println("ingrese un numero entero positivo");
            int num=leer.nextInt();
            suma= suma+ num;
        } while (suma < limite);
        
        
    }
    
}
