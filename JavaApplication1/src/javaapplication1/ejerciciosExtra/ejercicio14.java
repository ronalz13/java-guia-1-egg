/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 *
 * @author ronald
 */
public class ejercicio14 {
    public static void main(String[] args) {
        System.out.println("ingrese el valor em en euros que desea convertir");
        Scanner leer= new Scanner(System.in);
        
        double valor= leer.nextDouble();
        
        System.out.println("indique el tipo de moneda al que desea convertir:");
        System.out.println("libras");
        System.out.println("dolares");
        System.out.println("yenes");
        System.out.println("salir");
        
        String moneda;
        moneda=leer.next();
        switch (moneda) {
            case "libras":
                libras(valor, moneda);
                break;
            case "dolares":
                dolares(valor, moneda);
                break;
            case "yenes":
                yenes(valor, moneda);
                break;
            case "salir":
                System.out.println("hasta luego");
                break;
            default:
                System.out.println("indique una opcion correcta");
                
        }
    }

 public static void libras(double valor, String moneda){
     double calculo;
     calculo= valor*0.86;
     System.out.println(calculo+" "+moneda);
     }

public static void dolares(double valor, String moneda){
 double calculo;
 calculo = valor*1.28611;
System.out.println(calculo+" "+moneda);
} 
public static void yenes(double valor, String moneda){
    double calculo= valor*129.852;
    System.out.println(calculo+" "+moneda);
}

}