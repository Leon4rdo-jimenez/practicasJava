/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
los 5 primeros números enteros a partir de uno que se introduce por teclado.*/


package com.Ejercicios.Bucles;

import java.util.*;


public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);      
        int numero;
        System.out.println("Ingrese un numero entero: ");
        numero = entrada.nextInt();
        
        
        //Imprimir el encabezado de la tabla
        System.out.println("\nTABLA DE POTENCIAS");
        System.out.println("---------------------------");
        System.out.printf("%-5s %-20s %-20s%n", "Numero", "Cuadrado", "Cubo");
        
        
        //Usamos un solo bucle para mostrar todo por filas/Columnas
        for(int i = 0; i <=5;i++){
        int n = numero + i;
        long cuadrado = (long)n * n;
        long cubo = (long) n * n * n;
        
            System.out.printf("%-5s %-20s %-20s%n", n, cuadrado, cubo);
        }
        
        entrada.close();     
        
    }
}
