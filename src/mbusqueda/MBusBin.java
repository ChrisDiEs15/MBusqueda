/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbusqueda;

/**
 *
 * @author EQ40
 */
public class MBusBin {
    public static int BusquedaBinaria(int tamano, int valor, int[]arreglo){
    int resultado=0;
    int inicio=0;
    int fin=tamano-1;
    int medio = (int) Math.floor(inicio+fin/2);
    while (inicio<=fin){
        if(arreglo[medio]<valor){
        inicio=medio+1;
        
        }else if(arreglo[medio] == valor){
            System.out.println("El dato esta en la posicion"+(medio+1));
            resultado = medio+1;
            break;
                }else{
        fin=medio-1;
        }
    medio=(inicio+fin)/2;
    
    }
    if (inicio>fin){
        
       System.out.println("no se encontro");
    }
   
    return resultado;
    }
}
