package com.michielherpers.arrays;

import java.util.Arrays;

public class ExerciseArrays {

    public static void main(String[] args) {

        //Exercise 1, reverse String
        String string = "Hello, my name is Michiel.";
        String reverse = Exercise1.reverseString(string);
        System.out.println(reverse); //.leihciM si eman ym ,olleH
        String reverse2 = Exercise1.reverseString2(string);
        System.out.println(reverse2); //.leihciM si eman ym ,olleH
        String reverse3 = Exercise1.reverseStringAsCharArray(string);
        System.out.println(reverse3); //.leihciM si eman ym ,olleH

        System.out.println();

        //Exercise2 merge two arrays, so the merged array has all integers in order from small to big
        int[] array1 = {0, 3, 4, 31};
        int[] array2 = {4, 6, 30};

        int[] mergedArray = Exercise2.mergeArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray)); //[0, 3, 4, 4, 6, 30, 31]
    }
}

class Exercise1{

    //Exercise 1
    //Create a function that reverses a String
    //Use the knowledge that a String is actually an array of characters
    //"Hello, my name is Michiel"
    public static String reverseString(String string){ //  O(n), with n is the length of string

        if (string == null || string.length() < 2) return string;

        String newString = "";
        for (int i = 0; i < string.length(); i++){
            newString += string.charAt(string.length() - i - 1);
        }

        return newString;
    }

    //Using reversed for loop
    public static String reverseString2(String string){

        if (string == null || string.length() < 2) return string;

        String newString = "";
        for (int i = string.length() - 1; i >= 0; i--){
            newString += string.charAt(i);
        }

        return newString;
    }

    //Using char[]
    public static String reverseStringAsCharArray(String string){ //  O(n), with n, number of char in string

        if (string == null || string.length() < 2) return string;

        char[] charArray = string.toCharArray();
        char[] newCharArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++){
            newCharArray[i] = charArray[(charArray.length - 1) - i];
        }
        return String.copyValueOf(newCharArray);
    }

}

class Exercise2{

    //Merge two arrays
    public static int[] mergeArrays(int[] array1, int[] array2){ //  O(n)

        if(array1 == null || array2 == null) return null;
        else if (array1.length == 0 && array2.length == 0) return new int[0];
        else if (array1.length == 0) return array2;
        else if (array2.length == 0) return array1;

        /*int[] mergedArray = new int[array1.length + array2.length];
        for(int i = 0; i < array1.length; i++){
            mergedArray[i] = array1[i];
        }
        for(int i = 0; i < array2.length; i++){
            mergedArray[array1.length + i] = array2[i];
        }

        //sort
        Arrays.sort(mergedArray); //Uses O(n log(n))*/

        //sort
        //Use my own sort + merge algorithm here, has a BigO of 0(n). Other way using nested loops would be O(n^2)
        int indexArray1 = 0;
        int indexArray2 = 0;
        int indexMerged = 0;
        int[] mergedArray = new int[array1.length + array2.length];
        while(indexArray1 < array1.length && indexArray2 < array2.length){ // O(n)
            if(array1[indexArray1] <= array2[indexArray2]){
                mergedArray[indexMerged] = array1[indexArray1];
                indexArray1++;
            }
            else{
                mergedArray[indexMerged] = array2[indexArray2];
                indexArray2++;
            }
            indexMerged++;
        }

        //Add what was left
        for(int i = indexArray1; i < array1.length; i++){
            mergedArray[indexMerged] = array1[indexArray1];
            indexMerged++;
        }
        for(int i = indexArray2; i < array2.length; i++){
            mergedArray[indexMerged] = array2[indexArray2];
            indexMerged++;
        }

        return mergedArray;
    }
}

class Exercise3{
    //Look at the "Interview Questions: Arrays" for more Exercises
}
