/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Ejercicios.Arrays;

/**
 *
 * @author Leonj
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        double[] nota = new double[4];
        System.out.println("Para calcular la nota media nececito saber la \nla nota de cada uno de tus examenes." );
        
        
        for(int i = 0; i < 4; i++){
        
            System.out.println("Nota del examen n° " + (i + 1) + ".");
            nota[i] = Double.parseDouble(System.console().readLine());
        
        }
        
        System.out.println("Tus notas son: ");
        
        double suma = 0;
        
        for(int i = 0; i < 4 ; i++){
            System.out.println(nota[i] + " ");
            suma += nota[i];
        }
        
        System.out.println("\nLa media es " + suma / 4);
    }
    
   
            }
