/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano.
 * @author ronald
 */
public class ejercicio4x {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un valor entre 1 y 9");
        
        int num= leer.nextInt();
        if (0<num && num<10){
            switch (num) {
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VII");
                    break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                    break;
            }
        }
            else {
                    System.out.println("numero incorrecto");
                    }
        }
        
        
        
        
    }
       

