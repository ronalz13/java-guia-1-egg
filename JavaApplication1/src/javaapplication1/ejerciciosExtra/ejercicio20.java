/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la 
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que 
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. 
El programa deberá comprobar que los números introducidos son correctos, es decir, 
están entre el 1 y el 9.
 * @author ronald
 */
public class ejercicio20 {
    public static void main(String[] args) {
        System.out.println("comprobemos si la matriz es magica");
        Scanner leer= new Scanner(System.in);
        
        int[][] matrizM = new int[3][3];
        int num;
        System.out.println("ingrese los valores de la matriz (1-9)");
        
        int cont=0;
        boolean valid= true;
       // while (cont<9){
            
            
                for (int i = 0; i < 3; i++) {
                 for (int j = 0; j < 3; j++) {
                        num= leer.nextInt();
                        
                        
                                
                        if(0<num && num<10){
                         matrizM[i][j]= num;
                         
                         }
                        else{ System.out.println("ingrese un numero dentro del rango(1-9)");
                         num= leer.nextInt();
                        matrizM[i][j]= num;
                        }
                       
                                
                     }
                   
                 }
           int suma1= (matrizM[0][0]+ matrizM[0][1]+matrizM[0][2]);
           int suma2= (matrizM[0][0] + matrizM[1][0]+matrizM[2][0]);
           int suma3= (matrizM[0][0]+ matrizM[1][1]) + matrizM[2][2];
            if (suma1==suma2 && suma2==suma3) {
                System.out.println("la matriz ingresada es una matriz Magica");
        }
            else {System.out.println(":( la matriz no es magica");}
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(matrizM[i][j]);
                }
            System.out.println(" ");
    }
        
    }
    
}
