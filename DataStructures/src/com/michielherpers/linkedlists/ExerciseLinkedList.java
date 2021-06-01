package com.michielherpers.linkedlists;

import java.util.Arrays;
import java.util.LinkedList;

public class ExerciseLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(10);
        linkedList.addLast(16);
        linkedList.addLast(88);
        System.out.println(Arrays.toString(linkedList.toArray()));

        //reverse()
        LinkedList<Integer> reversed = Exercise1.reverse(linkedList);
        System.out.println(Arrays.toString(reversed.toArray()));
    }
}

class Exercise1{

    //Using a Singly Linked List, reverse the linked list by creating a method reverse()
    //Note that I am now using the non-custom LinkedList
    public static LinkedList<Integer> reverse(LinkedList<Integer> linkedList){ //O(n)

        if(linkedList != null && linkedList.size() > 2) {

            LinkedList<Integer> newLinkedList = new LinkedList<>();
            int index = linkedList.size() - 1;
            int value = 0;
            while (index >= 0) {
                value = linkedList.get(index);
                newLinkedList.addLast(value);
                index--;
            }
            return newLinkedList;
        }
        else if(linkedList == null){
            return null;
        }
        else{
            return linkedList;
        }
    }

}