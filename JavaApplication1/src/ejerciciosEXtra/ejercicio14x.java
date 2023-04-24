/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la 
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 * @author ronald
 */
public class ejercicio14x {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el numero de familias");
        int familias= leer.nextInt();
        int[] hijos = new int[familias];
        for (int i = 0; i < familias; i++) {
            System.out.println("ingrese el numero de hijos de la familia "+(i+1));
            int Nhijos=leer.nextInt();
            
            hijos[i]=Nhijos;
        }
       
        int i=0;
        int sumaEdad= 0;
         int ijos;
         int contProm=0;
         int cont = 0;
        while (i<familias) {
             
            do {
           
             ijos=hijos[i];
                System.out.println("ingrese la edad de cada uno");
             int edad = leer.nextInt();
            
                sumaEdad=sumaEdad + edad;
            
                 cont++;
                 contProm++;
            
            } while (cont<ijos);
        
        i++;
        
        }
        int prom=sumaEdad/(contProm);
       
       
        System.out.println("promedio de edad de los hijos "+prom);
       
    }
}
