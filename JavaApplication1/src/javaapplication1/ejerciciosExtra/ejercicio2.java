/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 * @author ronald
 */
public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("ingrese su nombre");
        Scanner leer= new Scanner(System.in);
        String nombre= leer.nextLine();
        System.out.println("bienvenido "+nombre);
    }
}
