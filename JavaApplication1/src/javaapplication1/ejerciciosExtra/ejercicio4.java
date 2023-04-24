/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author ronald
 */
public class ejercicio4 {
    public static void main(String[] args) {
        System.out.println("ingrese la cantidad en grados centigrados que desea convertir");
        Scanner leer= new Scanner(System.in);
        double cels= leer.nextDouble();
        
        double fareh= 32+((9*cels)/5);
          System.out.println("la cantidad en grados centigrados: "+cels+" esquivale a: "+fareh+" grados fahrenheit. ");
        
    }
        
           
    }
    

