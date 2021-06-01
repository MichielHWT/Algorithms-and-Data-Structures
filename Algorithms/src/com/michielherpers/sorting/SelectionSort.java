package com.michielherpers.sorting;

import java.util.Arrays;

public class SelectionSort {

    /*
        Selection Sort scans the list/array and saves the index of the smallest element
        At the end of one loop, put that element at the new index
        Only loop through elements that are now to the right, of the new indexed element
     */

    public static void main(String[] args) {

        int[] array = {7, 4, 1, 5, 10, 2};
        System.out.println(Arrays.toString(array)); //[7, 4, 1, 5, 10, 2]
        selectionSort(array);
        System.out.println(Arrays.toString(array)); //[1, 2, 4, 5, 7, 10]

    }

    static void selectionSort(int[] array){ //O(n^2)
        int temp = 0;
        int smallest = 0;
        boolean swap = false;
        for(int i = 0; i < array.length; i++){ //O(n)
            smallest = i; //reset initial
            swap = false;
            for(int j = i; j < array.length; j++){ //O(n)
                if(array[j] < array[smallest]){
                    smallest = j;
                    swap = true;
                }
            }
            if(swap){
                temp = array[i];
                array[i] = array[smallest];
                array[smallest] = temp;
            }
        }
    }
}
