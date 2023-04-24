/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas
 * @author ronald
 */
public class ejerccio1x {
    public static void main(String[] args) {
       System.out.println("ingrese una cantidad de tiempo en minutos");
       Scanner leer= new Scanner(System.in);
       
       int minutos= leer.nextInt();
       int horas= minutos/60;
       int dias= horas/24;
       
       if (dias>=1){
       horas= ((minutos/60)-(24*dias));
       }
       
        System.out.println("dias: "+dias);
        System.out.println("horas: "+horas);
       
             
        
    }
           
                
}
