/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbusqueda;

/**
 *
 * @author EQ40
 */
public class MBusBinRec {
    public static int MBusBinRec(int[] arr, int izquierdo, int derecho, int number) {
        /*si el izquierdo es mayor que el derecho esta fuera de la lista*/
        if (izquierdo > derecho) {
            return -1;
        }
        /*calcular el medio*/
        int medio = (int) Math.floor(derecho-izquierdo/2);
        /*si el numero es el que esta a la mitad*/
        if (number == arr[medio]) {
            return medio+1;
        } else if (number < arr[medio]) {
            /*si el numero a buscar es menor que el que esta a la mitad*/
            /*se recorre derecho se hace el medio menos 1*/
            return MBusBinRec(arr, izquierdo, medio - 1, number);
        } else {
            /*el izquierdo se mieve uno a la derecha*/
            return MBusBinRec(arr, medio + 1, derecho, number);
        }
    }
}
