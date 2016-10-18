package com.felight.myapp.utils;

/**
 * Created by vinaynoah on 14/07/16.
 */
public class Calculator {

    public static int[] generateSortedArray(int size){
        int[] array = new int[size];
        for(int i=0; i<array.length; i++)
            array[i] = i + 1;

        return array;
    }


    public static int[] generateSortedArrayDesc(int size){
        int[] array = new int[size];
        for(int i=array.length-1; i>=0; i--)
            array[i] = i + 1;

        return array;
    }

    public static int[] generateRandomArray(int size){
        int[] array = new int[size];
        for(int i=0; i<array.length; i++)
            array[i] = (int) (Math.random()*1000);

        return array;
    }

}
