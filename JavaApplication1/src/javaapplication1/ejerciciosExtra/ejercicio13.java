/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *
 *
 * @author ronald
 */
public class ejercicio13 {
    public static void main(String[] args) {
        System.out.println("ingrese un numero entero para dimensionar el recuadro");
        Scanner leer= new Scanner(System.in);
        int num= leer.nextInt();
        
        String[][] matriz= new String[num][num];
        
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
               if(i==0){
                matriz[i][j]="*";}
               else{matriz[i][j]=" ";}
                if (j==0){
                matriz[i][j]="*";}
                if(i==num-1){
                matriz[i][j]="*";}
                if(j==num-1){
                matriz[i][j]="*";}
                
            }
                
            }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println(""); 
        }
            
        }
        
        
        
    }

