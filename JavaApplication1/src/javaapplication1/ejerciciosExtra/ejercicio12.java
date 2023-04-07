/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author king_
 */
public class ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros enteros positivos");

        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        boolean condicion = true;
    
        do {
            System.out.println("MENU");
            System.out.println("1.sumar");
            System.out.println("2.restar");
            System.out.println("3.multiplicar");
            System.out.println("4.dividir");
            System.out.println("5.salir");
            System.out.println("elija opcion");

            int option = leer.nextInt();

            switch (option) {
                case 1:
                    int suma = num1 + num2;
                    System.out.println("la suma es igual a: " + suma);
                    break;
                case 2:
                    int resta = num1 - num2;
                    System.out.println("la resta es igual a: " + resta);
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println("la multiplicacion es igual a: " + mult);
                    break;
                case 4:
                    int div = num1 / num2;
                    System.out.println("la division es igual a: " + div);
                    break;
                case 5:
                    String salir;
                   
                    

                    System.out.println("seguro que desea abandonar el programa?:(S/N) ");
                    
                    do {
                         salir = leer.next();
                    if (salir.equalsIgnoreCase("s")) {
                        condicion= false;
                        break;
                    } else if (salir.equalsIgnoreCase("n")) {
                        break;
                    } else 
                        System.out.println(" ingrese una opcion valida.(S/N) ");
                        
                        
                     } while (!salir.equals("s") || !salir.equals("n"));
                    break;
                default:
                    System.out.println("ingrese una opcion valida");
                    break;
                   
            }

        } while (condicion);

    }

}
