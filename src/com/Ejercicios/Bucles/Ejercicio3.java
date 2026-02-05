//Realiza un programa que nos diga cuantos digitos tiene un numero
//introducido por teclado

package com.Ejercicios.Bucles;

import javax.swing.JOptionPane;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        int contador =1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entero no importa los digitos: "));
        String numeroAString = String.valueOf(numero);
        
        for(int i = 0; i < numeroAString.length(); i++){
          numeroAString.length(); 
            
        }
        
         System.out.println(numeroAString.length());
        
    }
  
}
