package com.michielherpers.sorting;

import java.util.Arrays;

public class InsertionSort {
    /*
        Insert an element in already sorted elements that have bee looked at in the loop
     */

    public static void main(String[] args) {

        int[] array = {7, 4, 1, 5, 10, 2};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void insertionSort(int[] array){ //O(n^2)
        int temp = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < array[i - 1]){

                for(int j = array[i - 1]; j < 1; j--){
                    if(array[j - 1] < array[i]){
                        temp = array[i];

                        //Have to insert, so that means that there is a shift in an array.
                        //For that, I have loop through the array, and shift everything one place
                        //Or I have to use Dynamic Arrays, the ArrayList instead.

                    }
                }
            }
        }
    }
}
