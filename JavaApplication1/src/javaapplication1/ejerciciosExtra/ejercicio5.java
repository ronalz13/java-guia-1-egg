/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 * @author ronald
 */
public class ejercicio5 {
    public static void main(String[] args) {
        System.out.println("ingrese el numero que desea comprobar");
        Scanner leer= new Scanner(System.in);
        
        int num= leer.nextInt();
        
        int doble= num*2;
        int triple= num*3;
        
        double raiz= sqrt(num);
        
        System.out.println("el numero ingresado fue: "+num);
        System.out.println("el doble del numero es: "+doble);
        System.out.println("el trple del numero es: "+triple);
        System.out.println("la raiz cuadrade del numero es: "+raiz);
        
        
        
   
       
    }
    
}
