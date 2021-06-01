package com.michielherpers.dynamicprogramming;

import java.util.HashMap;

public class FibonacciMemoization {

    /*
        Solve the Fibonacci sequence using recursion, but now using Dynamic Programming

        Save the Fibonacci number for N in cache
     */

    public static void main(String[] args) {

        System.out.println(fibonacciDynamicProgramming(100));

    }

    static HashMap<Integer, Long> cache = new HashMap<>(); //Is there a way to get this inside the method? --> put inside  a new method only works in javascript
    static long value;

    static long fibonacciDynamicProgramming(int number){

        //Check cache
        if (cache.containsKey(number)) {
            return cache.get(number);
        }

        //Base case
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else if (number < 0) { //negative not allowed
            return -1;
        }

        //Recursive
        value = fibonacciDynamicProgramming(number - 1) + fibonacciDynamicProgramming(number - 2);

        //Cache
        cache.put(number, value);

        //Recursive
        return value;
    }
}
