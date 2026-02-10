/*Escribe un programa que calcule la media de un conjunto de números positivos
introducidos por teclado. A priori, el programa no sabe cuántos números se
introducirán. El usuario indicará que ha terminado de introducir los datos
cuando meta un número negativo.*/



package com.Ejercicios.Bucles;

import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero positivo o negativo para salir: "));
        int suma = 0;
        int contador = 0;
        int calcularMedia;

        while (true) {

            if (numero1 < 0) {
                calcularMedia = suma / contador;
                JOptionPane.showMessageDialog(null, "La media de los numeros ingresados es: " + calcularMedia);
                break;
                
            }

            
            suma += numero1;
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero positivo o negativo para salir: "));
            contador++;
            

        }

    }

}
