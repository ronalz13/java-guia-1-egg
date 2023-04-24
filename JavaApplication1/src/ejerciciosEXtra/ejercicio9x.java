/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
50
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 * @author ronald
 */
public class ejercicio9x {
//ejercicio en grupo recordar practicar
    public static void main(String[] args) {
        System.out.println("introduzca el dividendo y el divisor");
        Scanner leer;
        leer = new Scanner(System.in);

        int dividendoNumero;
        int divisorNumero1;
        int resta;
        int cont;
        int aux;

        cont = 0;

        do {

            System.out.println("Ingres dos numeros que sean mayores a 1");
            System.out.println("");
            System.out.println("Ingres el numero dividendo");
            dividendoNumero = leer.nextInt();
            System.out.println("Ingres el divisor 2");
            divisorNumero1 = leer.nextInt();

        } while (dividendoNumero < 0 || divisorNumero1 < 0);

        aux = divisorNumero1;

        do {

            resta = dividendoNumero - divisorNumero1;
            dividendoNumero = resta;

            cont++;

        } while (divisorNumero1 <= resta);

        System.out.println("El cociente de la división es: " + cont);
        System.out.println("El resto de la división es: " + dividendoNumero);
        
     
        
    }
}
