/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, 
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 * @author ronald
 */
public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("intercambio de valores en las variables A,B,C,D");
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el valor de A");
        int A= leer.nextInt();
        System.out.println("ingrese el valor de B");
        int B= leer.nextInt();
        System.out.println("ingrese el valor de C");
        int C= leer.nextInt();
        System.out.println("ingres el valor de D");
        int D= leer.nextInt();
        int aux;
        int a,b,c,d;
        //intercambiamos el valor de B por C
       aux= B;
       b=C;
       //intercambiamos el valor de c por A
       c=A;
       // intercambiamos el valor de A por D
       a=D;
       // intercambiamos el valor de D por B
       d=aux;
       
        System.out.println("los valores iniciales son: ");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        System.out.println("---------------------");
        System.out.println("los valores intercambiados son:");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        System.out.println("C "+c);
        System.out.println("D: "+d);
    }
    
}
