/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

/**
 *Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la 
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se 
obtiene cambiando sus filas por columnas (o viceversa
 * @author ronald
 */
public class ejercicio18 {
    public static void main(String[] args) {
        System.out.println("a continuacion se presentan una matriz A y su traspuesta B");
        
        int[][] matrizA= new int[4][4];
        int[][] matrizB= new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizA[i][j]= ((int)(Math.random() * 10));
                
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizB[i][j]=matrizA[j][i];
                
            }
        }
        System.out.println("matriz A");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizA[i][j]);
                
            }
            System.out.println(" ");
        }
        System.out.println("matriz B");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizB[i][j]);
                
            }
            System.out.println(" ");
        }
        
    }
}
