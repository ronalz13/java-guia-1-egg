/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *
 * @author ronald
 */
public class ejercicio10x {
    public static void main(String[] args) {
        //ejerciciohecho en grupo volverlo a hacer
        
        Scanner leer;
        leer = new Scanner(System.in);

        int resultadoMulti;
        int numeroAleatorio1;
        int numeroAleatorio2;
        int leerNum1;
        
       
        // (max - min) + min
        numeroAleatorio1 = (int) (Math.random() * 8 + 1);
        numeroAleatorio2 = (int) (Math.random() * 10 + 1);

        resultadoMulti = numeroAleatorio1 * numeroAleatorio2;
        System.out.println(numeroAleatorio1 +""+numeroAleatorio2);

        do {

            System.out.println("Adivine el rusltado de la multiplicación");
            leerNum1 = leer.nextInt();

        } while (leerNum1 != resultadoMulti);

        if (leerNum1 == resultadoMulti) {

            System.out.println("¡¡Numero [" + leerNum1 + "] ingresado  correcto!!");

        
    }
    }
}
