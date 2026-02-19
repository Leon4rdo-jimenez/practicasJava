
package com.Ejercicios.Arrays;


public class Ejercicios {
    
    public static void main(String[] args) {
        
    //Creamos el arry y le ponemos unas operaciones.
    int[] num = new int [10];
    num[0] = 8; 
    num[1] = 33; 
    num[2] = 200; 
    num[3] = 150;
    num[4] = 11;
    num[5] = 88;
    num[6] = num[2] + 10; 
    num[7] = num[2] / 10;
    num[8] = num[6] + num[1] + num[2];
    num[9] = num[8]; 
    
        System.out.println("El Array num contiene los siguiente elementos: ");
        
        /*Para recorrer todos los elementos de un array se suele utilizar un bucle for junto con
        un índice que va desde 0 hasta el tamaño del array menos 1*/
        for(int i = 0; i <9; i++){
            System.out.println(num[i]);
        }
    
    
    }
    
    
}
