/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author ronald
 */
public class ejercicio19 {
    public static void main(String[] args) {
        System.out.println("se evaluara una matriz para comprobar si es asimetrica");
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese los valores de la matriz");
       int[][] matrizA= new int[3][3];
        int[][] matrizB= new int[3][3];
        int dato;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) 
            {
                dato= leer.nextInt();
                matrizA[i][j]=dato;
                
                        }
        }
        int cont= 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j]=matrizA[j][i];
                if (matrizB[i][j]==(-matrizA[i][j])){
                    cont++;
                }
            }
        }
        if(cont==9){
        System.out.println("la matriz es antisimetrica");}
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizA[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("--------------------------------------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizB[i][j]);
                
            }
            System.out.println(" ");
        }
    }
}
