/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mbusqueda;

import java.util.Random;

/**
 *
 * @author EQ40
 */
public class CreateArray {
    /*creates an array and fill with random numbers*/
    public static int[] NewArray(int numEl) {
        Random RandomNumber =new Random();
        int[] newArray = new int[numEl];
        
        for (int i = 0; i < numEl; i++) {
            /*only generate from 0 to 100*/
            int nwEl = RandomNumber.nextInt(100);
            newArray[i] = nwEl;
        }
        return newArray;
    }
    
}
