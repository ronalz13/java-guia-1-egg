/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Leer la altura de N personas y determinar el promedio de estaturas que se encuentran 
por debajo de 1.60 mts. y el promedio de estaturas en general.

 * @author ronald
 */
public class ejercicio6x {
    public static void main(String[] args) {
        System.out.println("ingrese la cantidad de personas");
        Scanner leer= new Scanner(System.in);
        
        double N= leer.nextDouble();
        int cont=0;
        double sumatoriAlturas=0;
        int cont2=0;
        double general=0;
        do {
               
                
            System.out.println("ingrese la estatura:");
              double altura= leer.nextDouble();
              general=general+altura;
              
              if (altura<1.60){
            sumatoriAlturas+=altura;
            cont2++;
        }
              cont++;
        } while (cont!=N);
        
        double promedio=sumatoriAlturas/cont2;
        double promGeneral=general/N;
        System.out.println("el promedio de estatura de las personas po debajo de 1.60 es :"
                + promedio);
        System.out.println("el promedio de estatura feneral es: "+promGeneral);
    }
    
}

