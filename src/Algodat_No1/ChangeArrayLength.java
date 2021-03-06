/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algodat_No1;

import java.lang.reflect.Array;

/**
 *
 * @author Windows 8
 */
public class ChangeArrayLength {
    public static Object[][] changeLength2D(Object [][] a, int n, int m, int newLength, int newLength2){
        
        if (n> newLength){
            throw new IllegalArgumentException("new length is too small");
        }
        if(m>newLength2){
            throw new IllegalArgumentException("new length 2 is too small");
        }

        Object [][] newArray = (Object [][]) Array.newInstance(a.getClass().getComponentType(), newLength, newLength2);

        newArray = (Object[][])a.clone(); 
        
        return newArray;
    }
    
    public static Object [][] changeLength2D(Object[][] a, int newLength, int newLength2){
        return changeLength2D(a, a.length, a[0].length, newLength, newLength2);
    }
}
