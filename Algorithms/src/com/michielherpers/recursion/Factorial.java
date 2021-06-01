package com.michielherpers.recursion;

public class Factorial {

    public static void main(String[] args) {

        //Create two methods that return the factorial of any number (5! = 5*4*3*2*1)
        //One is a recursive method
        //One is a iterative method, using a for loop

        //Recursive
        findFactorialRecursive(10);
        System.out.println(factorial);
        Factorial.factorial = 1; //reset

        //Recursive 2
        System.out.println(findFactorialRecursive2(10));
        System.out.println(findFactorialRecursive2(-2)); //negative input throws stackoverflow error if there is no extra statement

        //Iterative
        System.out.println(findFactorialIterative(10));

    }

    static long factorial = 1;
    static void findFactorialRecursive(int number){

        factorial = factorial*number;

        //Base case
        if(number == 1){
            return;
        }

        //Recursive case
        number--;
        findFactorialRecursive(number);
    }

    static long findFactorialRecursive2(long number){
        //Base case
        if(number == 2){ //The moment the number input is 2, the stack won't grow, and all methods are executed
            return 2;
        }
        //Recursive case
        if(number < 2) return -1; //Negative input or smaller than 2 not allowed
        return number*findFactorialRecursive2(number - 1);
    }

    static long findFactorialIterative(int number){
        long factorial = 1;
        for(int i = number; i > 0; i--){
            factorial = factorial*i;
        }
        return factorial;
    }
}
