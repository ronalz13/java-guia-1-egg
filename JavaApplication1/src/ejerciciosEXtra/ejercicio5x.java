/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
para los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
tratamientos. 
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio.

 * @author ronald
 */
public class ejercicio5x {
    public static void main(String[] args) {
        System.out.println("obra social c.a");
        Scanner leer= new Scanner(System.in);
        
        System.out.println("ingrese el tipo de socio de acuerdo a su clseficacio(A-B.C");
        String socio= leer.next();
        String opcion = socio.toUpperCase();
        
        if (socio.equalsIgnoreCase("A") || socio.equalsIgnoreCase("B") || socio.equalsIgnoreCase("c") ){
            System.out.println("ingrese el costo del tratamiento ");
        double costo= leer.nextDouble();
        switch (opcion) {
            case "A":
                double tratamiento;
                tratamiento=(costo*0.5);
                System.out.println("socio de tipo A");
                System.out.println("el monto a cancelar es: "+tratamiento);
                break;
            case "B":
                tratamiento= ((costo)-(costo*0.35));
                System.out.println("socio de tipo B");
                System.out.println("el monto a cancelar es: "+tratamiento);
                break;
            case "C":
                
                System.out.println("socio de tipo C, no tiene descuento");
                System.out.println("el monto a cancelar es: "+costo);
                break;
        }
        }
        else
        {System.out.println("tipo de socio no valido");
                }
            
        }
        
        
        
        
    }

