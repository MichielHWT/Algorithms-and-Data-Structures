package com.michielherpers.recursion;

public class BaseCase {

    public static void main(String[] args) {

        //Every recursive method needs a base case, otherwise there will be a stackoverflow error
        //This means that it needs a statement that will result in the method to return and stop looping
        method();
    }

    static int counter = 0;
    //Recursion
    static void method(){
        if (counter > 10){ //base case
            return;
        }
        counter++; //recursive case
        method();
    }
}


