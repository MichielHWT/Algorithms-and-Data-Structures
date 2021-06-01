package com.michielherpers.recursion;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("Hello world."));
    }

    //Recursive method
    static String reverse(String str){

        //Base case
        if(str.length() == 1){
            return str;
        }

        //Recursive case
        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }
}
