package com.michielherpers.sorting;

import java.util.*;

public class ProblemWithSortMethod {

    public static void main(String[] args) {

        //Integers

        //Arrays
        int[] array = {1, 5, 3, 2, 7, 4};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); //[1, 2, 3, 4, 5, 7]

        //Lists
        int[] array2 = {1, 5, 3, 2, 7, 4};
        List<Integer> list = new ArrayList<>();
        for(int i : array2){
            list.add(i);
        }
        list.sort(Comparator.comparingInt(Integer::intValue)); //List could have different Object types, si have to specify

        System.out.println(Arrays.toString(list.toArray())); //[1, 2, 3, 4, 5, 7]

        //Characters
        //Arrays
        char[] arrayc = {'b', 'a', 'z', 'g', 'n'};
        Arrays.sort(arrayc);
        System.out.println(Arrays.toString(arrayc)); //[a, b, g, n, z]

        //Lists
        char[] arrayc2 = {'b', 'a', 'z', 'g', 'n'};
        List<Character> list2 = new ArrayList<>();
        for(char i : arrayc2){
            list2.add(i);
        }
        list2.sort(Comparator.comparingInt(Character::charValue)); //List could have different Object types, si have to specify

        System.out.println(Arrays.toString(list2.toArray())); //[a, b, g, n, z]

    }


}
