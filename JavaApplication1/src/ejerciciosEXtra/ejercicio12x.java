/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosEXtra;

import static java.lang.String.valueOf;

/**
 *Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String
 * @author ronald
 */
public class ejercicio12x {
    public static void main(String[] args) {
        System.out.println("contador de 3 digitos");
        int[][][]matrizA= new int[10][10][10];
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    matrizA[i][j][k]=0;
                    
                }
            }
        }
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                String I=valueOf(i);
                String J = valueOf(j);
                String K = valueOf(k);
                if ("3".equals(I) || "3".equals(J) ||"3".equals(K) ){
                    I=I.replace("3", "E");
                    K=K.replace("3", "E");
                    J=J.replace("3", "E");
                    
                }
                    System.out.println(I+"-"+J+"-"+K);
                
                
                
                 
                    
                    
                }
            }
        }
      
            
        }
      
    }
    

