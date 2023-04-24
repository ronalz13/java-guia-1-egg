/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el 
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los 
números serán introducidos por el usuario. Realice dos versiones del programa, una 
usando el bucle “while” y otra con el bucle “do - while”.
 * @author ronald
 */
public class ejercicio7x {
    public static void main(String[] args) {
        System.out.println("ingrese la cantidad de datos");
        Scanner leer= new Scanner(System.in);
        
        int cont=0;
        int N;
        int dato;
        int mayor=0;
        int suma=0;
        int menor;
                menor = 0 ;
        N= leer.nextInt();
        System.out.println("ingrese los numeros");
        do {
            dato=leer.nextInt();
            suma=suma+dato;
            if (mayor<dato){
            mayor=dato;
            }
            else  if(dato>menor)
                    {menor=dato;
                    
                    }
        
             cont++;
        } while (cont!=N);
        double prom=suma/cont;
        //int maximo = Integer.MIN_VALUE;
//int minimo = Integer.MAX_VALUE;
        System.out.println("el numero mayor es: " +mayor);
        System.out.println("el numero menor e: " +menor);
        System.out.println("el promedio es: "+prom);
    }
}
