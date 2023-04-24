/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras para
 * 
 * niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en
 * orden horizontal en una fila que será seleccionada de manera aleatoria. Una
 * vez concluida la ubicación de las palabras, rellene los espacios no
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por
 * pantalla la sopa de letras creada. Nota: Para resolver el ejercicio deberá
 * investigar cómo se utilizan las siguientes funciones de Java substring(),
 * Length() y Math.random().
 *
 * @author ronald
 */
public class ejercicio24x {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("generacion de sopa de letras");
        String[][] sopa=new String[20][20];
        String[] palabras= new String[5];
        String ingreso;
        int cont=0;
       
        do{
            System.out.println("ingre se la palabra");
            ingreso=leer.nextLine();
            if(ingreso.length()>2 && ingreso.length()<6){
                palabras[cont]=ingreso;
                cont++;
                 }
            else{
                System.out.println("la palabra esta fuera de rango");
                
            }
        }
          while(cont<5);  
        System.out.println("-------------------");
        //imprimi las palabras para comprobar    
        for (int i = 0; i < 5; i++) {
            System.out.println(palabras[i]);
        
        }
          

 llenarSopa(sopa);

sustituirSopa(sopa, palabras);
    
}

public static void llenarSopa(String sopa[][]){

    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
            sopa[i][j]="*";
            
        }
    }
    //imprimir la matriz para comprobar
    /*for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
            System.out.print(sopa[i][j]);
        }
        System.out.println("|");
    }*/
}
public static void sustituirSopa(String sopa[][],String palabras[]) {
    
    // filas son todas las filas de la matriz asignadas a una lista
    List<Integer> filas;
        filas = new ArrayList<>(19);
    for (int i=0;i<19;i++){
        filas.add(i);
        }
// Instanciamos la clase Random esa es la fila que vamos a elegir
    Random randomF = new Random();

   int aux=0;
   while (aux<5 ){
       //se usa el random para asignar un valor aleatorio
       int randRow = randomF.nextInt(filas.size());
       //cn esto sacamos de la lista los numeros que ya usamos
        filas.remove(randRow);
        String pal= palabras[aux];
        int randCol= (int) (Math.random()*(19-pal.length()));
      
        
            for (int k = 0; k < pal.length(); k++) {
                sopa[randRow][randCol+k]= pal.substring(k,k+1);
                //System.out.println(randRow+"|"+randCol+"|"+k);
                System.out.println(pal.substring(k,k+1));
            }
        aux++;  
        }
        
    for (int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
            System.out.print(sopa[i][j]);
        }
        System.out.println("|");
    }
   
    }
      
      
   }
  