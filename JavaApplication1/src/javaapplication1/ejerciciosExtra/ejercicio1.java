/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 *
 * @author ronald
 */
public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("ingrese dos numeros enteros para sumarlos");
        
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el pirmer numero");
        int num1= leer.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2= leer.nextInt();
        
        int suma= num1+num2;
        System.out.println("la suma de los dos numeros es:  "+suma);
       
    }
}
