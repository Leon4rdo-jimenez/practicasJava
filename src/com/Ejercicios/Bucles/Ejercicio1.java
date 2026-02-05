/*Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.*/


package com.Ejercicios.Bucles;

import javax.swing.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        final int combinacion = 1234;
        int numeroIntentos = 4;
        int pedirCombinacion;

        int i = 1;
        while (i <= numeroIntentos) {
        pedirCombinacion = Integer.parseInt(JOptionPane.showInputDialog("Inserta La Combinacion: "));
            if (combinacion != pedirCombinacion) {
                JOptionPane.showMessageDialog(null, "Combincion Incorrecta");
            } else {
                JOptionPane.showMessageDialog(null, "Combincion Correcta" + "\n Accediendo...");
                break;
            }
            i++;
        }
        

    }

}

