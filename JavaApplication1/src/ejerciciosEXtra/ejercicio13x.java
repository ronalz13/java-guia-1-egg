/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *3. Crear un programa que dibuje una escalera de números, donde cada línea de números 
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al 
usuario al comenzar. Ejemplo: si se ingresa el número 3: 
1
12
123

 * @author ronald
 */
public class ejercicio13x {
    public static void main(String[] args) {
        System.out.println("ingrese el tamaño de la escalera");
    Scanner leer = new Scanner(System.in);
    
    int num = leer.nextInt();
     int cont=0;
        do {
            cont++;
            for (int i = 1; i < cont; i++) {
                System.out.print(i);
            }
            System.out.println(" ");
        } while (cont<=num);
        
    
    
}
    
    
}
