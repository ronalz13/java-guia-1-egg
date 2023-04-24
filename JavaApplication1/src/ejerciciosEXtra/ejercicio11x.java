/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el 
operador de división. Nota: recordar que las variables de tipo entero truncan los 
números o resultados.

 * @author ronald
 */
public class ejercicio11x {
    public static void main(String[] args) {
        System.out.println("introduzca un numero ");
        Scanner leer= new Scanner(System.in);
        int cont=0;
        int num = leer.nextInt();
        do {
            int num2 = num/10;
            num=num2;
            cont++;
        } while (num>0);
        
        System.out.println(cont);
         
       
        
    }
    
}
