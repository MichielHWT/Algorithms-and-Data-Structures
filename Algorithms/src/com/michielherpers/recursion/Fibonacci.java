package com.michielherpers.recursion;

public class Fibonacci {

    public static void main(String[] args) {

        //Find the Fibonacci number of input
        //input is the index on the fibonacci sequence
        //0, 1, 1, 2, 3, 5, 8, etc.

        //Recursive
        System.out.println(findFibonacciRecursive(10));

        //Iterative
        System.out.println(findFibonacciIterative(10));


    }

    static long findFibonacciRecursive(int number){ //O(2^n), exponential growth, because every method call, calls two new methods

        //Base case
        if(number == 0){
            return 0;
        }
        else if(number == 1){
            return 1;
        }
        else if(number < 0){ //negative not allowed
            return -1;
        }

        //Recursive case
        return findFibonacciRecursive(number - 1) + findFibonacciRecursive(number - 2);
    }

    static long findFibonacciIterative(int number){ //O(n)
        long indexValue = 1; //index 1
        long previousIndexValue = 0; //index 0
        long newValue = 1;
        for(int i = 0; i < number - 1; i++){
            newValue = indexValue + previousIndexValue;
            previousIndexValue = indexValue;
            indexValue = newValue;
        }
        return indexValue;
    }
}
