/*Muestra la tabla dwe multiplicar del numero introducido*/



package com.Ejercicios.Bucles;

import javax.swing.JOptionPane;

public class Ejercicio2 {

    public static void main(String[] args) {
        int pedirNumero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre 1 - 10: "));

        for (int i = 1; i <= pedirNumero; i++) {
          int multiplicacion = i*i;
           JOptionPane.showMessageDialog(null,(i + " * " + i + " = " + multiplicacion)); 
        }
    

    

    
}
}
