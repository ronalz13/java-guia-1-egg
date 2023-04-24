/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos)
 * @author ronald
 */
public class ejercicio17 {
    public static void main(String[] args) {
        System.out.println("indique el tamaño del vector");
     // 12345
        Scanner leer= new Scanner (System.in); 
        int tamaño = leer.nextInt();
        int[] vector= new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            vector[i]=i;
            
        }
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
        
       // for (int i = 0; i < tamaño; i++) {
          // System.out.print(vector[i]+",");}
            
       
        
        for (int i = 0; i < tamaño; i++) {
            int cifras=0;
            while(vector[i]!=0){             //mientras a n le queden cifras
                   vector[i] = vector[i]/10;         //le quitamos el último dígito
                   cifras++;
                 }
        if (cifras==1){
            cont1++;}
            if (cifras==2){
            cont2++;}
            if (cifras==3){
            cont3++;}
            if(cifras==4){
            cont4++;}
            if (cifras==5){
            cont5++;}
}       
        
         System.out.println("numeros de una cifra: "+cont1);
         System.out.println("numeros de dos cifras: "+cont2);
         System.out.println("numeros de tres cifras: "+cont3);
         System.out.println("numeros de cuatro cifras: "+cont4);
         System.out.println("numeros de cinco cifras: "+cont5);
         
}
}