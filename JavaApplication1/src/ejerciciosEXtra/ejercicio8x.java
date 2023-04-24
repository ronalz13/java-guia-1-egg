/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.Scanner;

/**
 *Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares 
y la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 * @author ronald
 */
public class ejercicio8x {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        boolean terminar = true;
        int contPar=0;
        int contImp=0;
        System.out.println("el programa leera numeros enteros ");
        
        do {
            System.out.println(" ingrese un numero");
            int num= leer.nextInt();
            if (num%2==0){
                contPar++;}
                else{
                        contImp++;
                        }
            if(num%5==0){
                
                 terminar= false;
            }
           
            
        } while (terminar);
        System.out.println("numeros pares: "+contPar);
        System.out.println("nimeeros impares: "+contImp);
        
    }
    
}
