package com.michielherpers.sorting;

import java.util.Arrays;

public class MergeSort {

    /*
        Merge Sort splits the array in equal parts, like a tree data structure
        It compares the smallest parts
     */

    public static void main(String[] args) {

        int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};
        System.out.println(Arrays.toString(array));
        int[] sortedArray = mergeSort(array);
        System.out.println(Arrays.toString(sortedArray));

    }

    //Recursive method
    static int[] mergeSort(int[] array){

        if(array == null) return null;

        if(array.length == 1){
            return array;
        }

        //Create Binary Tree data structure
        int[] arrayLeft = Arrays.copyOfRange(array, 0, (array.length/2));
        System.out.println(Arrays.toString(arrayLeft));
        int[] arrayRight = Arrays.copyOfRange(array, (array.length/2), array.length);
        System.out.println(Arrays.toString(arrayRight));

        return merge(mergeSort(arrayLeft), mergeSort(arrayRight));
    }

    static int[] merge(int[] arrayLeft, int[] arrayRight){ //O(n)
        int[] mergedArray = new int[arrayLeft.length + arrayRight.length];

        //Use my own findMergeIndex here
        //The problem is, when the left has [1, 3]  and the right has [2, 4], than merged should become [1, 2, 3, 4]
        //So i can't insert the whole array in one index in the left
        //Then I need a whole sort algorithm, to sort an array inside a sorting algorithm (???)

        for(int i = 0; i < mergedArray.length; i++){
            if(i < arrayLeft.length){
                mergedArray[i] = arrayLeft[i];
            }
            else {
                mergedArray[i] = arrayRight[i - (arrayLeft.length)];
            }
        }

        Arrays.sort(mergedArray); //Using standard sort algorithm, but using this here, how can this ever be fast?

        return mergedArray;
    }

    /*static int findIndexMerge(int[] arrayLeft, int[] arrayRight){
        int index = 0;
        //Assuming same length of 2^n
        for(int i = 0; i < arrayLeft.length; i++){
            if(arrayRight[0] < arrayLeft[i]){

            }
        }

        return index;
    }*/
}
