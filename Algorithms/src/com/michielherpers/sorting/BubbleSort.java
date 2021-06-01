package com.michielherpers.sorting;

import java.util.Arrays;

public class BubbleSort {

    /*
        A Bubble Sort, loops through the array and swaps two elements, when the left element, is bigger than the right
        This leads to the biggest element getting the last index the first loop.
        This repeats using a loop until all elements are in the right order
     */

    public static void main(String[] args) {

        int[] array = {7, 4, 1, 5, 10, 2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array)); //[1, 2, 4, 5, 7, 10]

    }

    static void bubbleSort(int[] array){ //O(n^2), because for loop in a while loop
        int counter = 1;
        int newValue = 1;
        while(counter != 0) { //O(n)
            counter = 0; //reset
            for (int i = 0; i < array.length - 1; i++) { //O(n)
                if(array[i] > array[i + 1]){ //if true, switch values
                    newValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = newValue;
                    counter++;
                }
            }
        }
    }
}
