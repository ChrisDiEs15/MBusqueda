/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbusqueda;


/**
 *
 * @author EQ40
 */
public class MBusSec {
    public static void MBusSec(int[]numeros, int numBuscado  ){
      boolean existe= true;
        for(int b = 0; b < numeros.length; b++){
            
            if(numeros[b]==numBuscado){
                
                System.out.println("el numero si existe, en la posicion "+(b+1));
                break;  
            }
            if(b == numeros.length-1){
                existe = false;
            }
        }
        if(existe==false){
            
            System.out.println("el numero no existe");
        }
     }
       
}
