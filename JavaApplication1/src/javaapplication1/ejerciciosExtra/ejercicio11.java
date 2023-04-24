/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.ejerciciosExtra;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que
ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas
e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 * @author king_
 */
public class ejercicio11 {
 
    
    public static void main(String[] args) {
       
        
        System.out.println("ingrese los datos en formato de dispositivo RS232");
        Scanner leer= new Scanner(System.in);
         String dato= leer.nextLine();
         int cont=0;
        int cont2=0;
        int largo = dato.length();
       
       if (largo==5)  {
        do{
       
        dato= leer.nextLine();
        if (dato.startsWith("X")&&(dato.endsWith("O")))
        {
        cont++;
            }
        else {cont2++;
            }
        }while (!dato.equals("&&&&&"));
       }
       else System.out.println("formato incorrecto");
                
        System.out.println("intentos correcto: "+ cont);
        System.out.println("intentos incorrectos: "+ cont2);
    }
}
