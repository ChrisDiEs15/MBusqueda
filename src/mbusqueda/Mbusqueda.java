/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mbusqueda;

import java.util.Scanner;

/**
 *
 * @author EQ40
 */
public class Mbusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de busqueda bnaria");
        System.out.println("Eliga uno de los metodos a buscar:");
        System.out.println("1.Busqueda secuencial");
        System.out.println("2.Busqueda Binara");
        System.out.println("3.Busqueda Binaria con Recursividad");
        int opcionS = sc.nextInt();
        /*pedir datos*/
        System.out.println("A continuacion se realizara un array llenado de manera Aleatoria");
                System.out.println("Ingrese el tamano del arreglo");
                int numEl = sc.nextInt();
                System.out.println("Ingrese el elemento a buscar, recuerde que es un elemento entero");
                int numSearch = sc.nextInt();
                int[] tmpArray = CreateArray.NewArray(numEl);
                /*llamar a la funcion de imprimir arreglo*/
                System.out.println("El arreglo creado es");
                PrintArray.Print(numEl, tmpArray);
                
        switch (opcionS) {
            case 1:
                System.out.println("se procedera a busqueda secuencial");
                MBusSec.MBusSec(tmpArray, numSearch);
                break;
            case 2:
                System.out.println("El arreglo se debe de ordenar antes de que se reciba el metodo de busqueda");
                int[] tmpArray2 = Ordenamiento.SelectionOrder(tmpArray, numEl);
                System.out.println("El arreglo ordenado es");
                PrintArray.Print(numEl, tmpArray2);
                System.out.println("se procedera a busqueda binaria");
                  MBusBin.BusquedaBinaria(numEl, numSearch, tmpArray2);

                break;
            case 3: 
                System.out.println("El arreglo se debe de ordenar antes de que se reciba el metodo de busqueda");
                int[] tmpArray3 = Ordenamiento.SelectionOrder(tmpArray, numEl);
                System.out.println("El arreglo ordenado es");
                PrintArray.Print(numEl, tmpArray3);
                /*se calculan los valores de derecho e izquierdo  o y final de array*/
                int izquierdo = 0;
                int derecho =tmpArray3.length-1;
                System.out.println("se procedera a busqueda binaria con recursividad");
                int resNumber=MBusBinRec.MBusBinRec(tmpArray3, izquierdo, derecho, numSearch);
                if(resNumber!=-1){
                System.out.println("El elemento se ha encontrado en las posicion:"+resNumber);
                }else{
                    System.out.println("El elemento a buscar no esta");
                };
                break;
            default:
                System.out.println("elija una opcion valida");
                break;
        };

    }

}
