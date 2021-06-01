package com.michielherpers.sorting;

import java.util.Arrays;

public class QuickSort {

    /*
        Pivoting technique (Take one index to start)

        Take the last index of the array (pivot), and take all numbers that are bigger than this number to the right,
         and leave the smaller numbers to the left.
         Now split the array at the number that was first at the last index (pivot)
         Now you have two arrays, for which you repeat the steps.

         Than merge to a sorted array

         Note: Quicksort is usually fast, but has some worst case scenarios.

     */

    public static void main(String[] args) {

        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(Arrays.toString(array));
        int[] sortedArray = quickSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }

    static int[] quickSort(int[] array){

        //System.out.println("Old: " + Arrays.toString(array));

        //Base case
        if(array.length <= 1){
            return array;
        }

        //Take pivot
        int pivotIndex = array.length - 1;
        int pivotValue = array[pivotIndex];

        //Move bigger numbers to the right
        int index = 0;
        while(index != pivotIndex){
            if(array[index] > pivotValue){
                array[pivotIndex] = array[index];
                if(pivotIndex > 0){
                    array[index] = array[pivotIndex - 1]; //Swap old position bigger number with index one left of pivot
                    array[pivotIndex - 1] = pivotValue; //Move pivot one left
                }
                else{
                    array[index] = pivotValue;
                }
                pivotIndex--; //pivot moved one position to the left
            }
            else {
                index++; //Only increment when not bigger than pivot, otherwise repeat the same index
            }
        }

        //System.out.println("New: " + Arrays.toString(array));
        //System.out.println("Pivot index:" + pivotIndex);

        //Split
        int[] arrayLeft = Arrays.copyOfRange(array, 0, pivotIndex);
        //System.out.println("Left: " + Arrays.toString(arrayLeft));
        int[] arrayRight = Arrays.copyOfRange(array, pivotIndex + 1, array.length);
        //System.out.println("Right: " + Arrays.toString(arrayRight));

        //Repeat (Recursion)
        return merge(quickSort(arrayLeft), pivotValue, quickSort(arrayRight));
    }

    static int[] merge(int[] arrayLeft, int pivotValue, int[] arrayRight){

        int[] mergedArray = new int[arrayLeft.length + arrayRight.length + 1];

        for(int i = 0; i < mergedArray.length; i++){
            if(i < arrayLeft.length){
                mergedArray[i] = arrayLeft[i];
            }
            else if(i == arrayLeft.length){
                mergedArray[i] = pivotValue;
            }
            else {
                mergedArray[i] = arrayRight[i - (arrayLeft.length + 1)];
            }
        }

        //System.out.println("Merged: " + Arrays.toString(mergedArray));

        return mergedArray;
    }

}
