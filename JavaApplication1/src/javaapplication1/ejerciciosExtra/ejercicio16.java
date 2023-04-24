/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un numero a buscar en el vector. El programa
 * mostrará donde se encuentra el numero y si se encuentra repetido
 *
 * @author ronald
 */
public class ejercicio16 {

    public static void main(String[] args) {
        System.out.println("ingrese el tamaño del vector");
        Scanner leer = new Scanner(System.in);
        int tamaño = leer.nextInt();
        System.out.println("indique el numero que desea buscar");
        int num = leer.nextInt();
        
         int retorno[]= llenaVector(tamaño);
         busquedaNum(tamaño, num, retorno);
         


    }

    public static int[] llenaVector( int tamaño) {

       int[] vector= new int[tamaño];
         
        for (int  i = 0;  i < tamaño;  i++) {
            vector[i]= (int)(Math.random()*10);
            
        }
        return vector ;

    }
    public static void busquedaNum(int tamaño, int num, int[] retorno) {
    
     int cont = 0;
     boolean noEsta= false;

        for (int i = 0; i < tamaño; i++) {
         
            if (retorno[i] == num) {
                System.out.println("el numero esta en la posicion: " + i);
                cont++;
            }
            else{
                noEsta=true;
            }
        }
        if (cont > 1) {
            System.out.println("el numero se repite: " + cont + " veces");
        }
        if (noEsta){
            System.out.println("el numero no se encuentra dentro del arreglo ");
        }
}
}
