/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

/**. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida 
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al 
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la 
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 *
 * @author ronald
 */
public class ejercicio21 {
    public static void main(String[] args) {
        System.out.println("comprobaremos si la matriz P se encuentra dentr de la matriz M");
        
        int[][] M= new int[10][10];
        int[][] P= new int[3][3];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               int num=(int)(Math.random() * 10);
                M[i][j]=num;
            }
                
              
            }
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                P[i][j]=(int)(Math.random() * 10);
                
            }
        }
    
        
        }
        public static void ubicacionMatriz(int matrizA[][], int matrizB[][])
    {
        int posicionInicial = matrizB[0][0];
        int cont = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrizA[0][0] == matrizB[i][j] && i < 8 && j < 8){
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizA[k][l]== matrizB[i+k][j+l]){
                                cont++;}
    }
                    }
                }
            }
        }
    }
}
                        
    

