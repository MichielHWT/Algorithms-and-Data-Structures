package com.michielherpers.linkedlists;

public class Main {
    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList(10);
        linkedList.append(12);
        linkedList.prepend(1);
        linkedList.insert(1, 33);
        linkedList.printLinkedList();
    }
}
