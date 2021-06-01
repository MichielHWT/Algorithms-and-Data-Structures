package com.michielherpers.hashtables;

import java.util.HashMap;

public class ExerciseHashMaps {

    public static void main(String[] args) {

        int[] array1 = {2, 5, 1, 2, 3, 5, 1, 2, 4};
        int[] array2 = {2, 1, 1, 2, 3, 4, 1, 2, 4};
        int[] array3 = {2, 3, 4, 5};

        int firstRecurringNumber = Exercise1.getRecurringCharacter(array1);
        System.out.println(firstRecurringNumber);

        int firstRecurringNumber2 = Exercise1.getRecurringCharacter(array2);
        System.out.println(firstRecurringNumber2);

        int firstRecurringNumber3 = Exercise1.getRecurringCharacter(array3);
        System.out.println(firstRecurringNumber3);
    }
}

class Exercise1{

    //Google question
    //Return the first recurring character, so which one repeated first
    //Make sure it will not get an BigO of O(n^2), but an O(n)
    //Given an array = [2, 5, 1, 2, 3, 5, 1, 2, 4]
    //It should return 2

    //Given an array = [2, 1, 1, 2, 3, 5, 1, 2, 4]
    //It should return 1

    //Given an array = [2, 3, 4, 5]
    //It should return undefined (or null)

    public static int getRecurringCharacter(int[] array) { //O(2n) --> O(n)

        if (array != null && array.length > 2) {

            //Create hashmap, which will contain the characters in the array as key, and the number of ocurring as value
            HashMap<Integer, Integer> counterHashMap = new HashMap<>();

            for(int i : array){ //O(n)
                if(!counterHashMap.containsKey(i)){
                    counterHashMap.put(i, 1);
                }
                else{ //Only true when key is already in the HashMap, so don't have to count
                    return i;
                }
            }
            return -1; //return -1 when no recurring characters
        }
        else{
            return -1;
        }
    }

}
