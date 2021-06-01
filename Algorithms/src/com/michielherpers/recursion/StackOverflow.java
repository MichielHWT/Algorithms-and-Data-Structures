package com.michielherpers.recursion;

public class StackOverflow {

    public static void main(String[] args) {

        method(); //Exception in thread "main" java.lang.StackOverflowError

    }

    //Recursion
    static void method(){
        method();
    }
}
