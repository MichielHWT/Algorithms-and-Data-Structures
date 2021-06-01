package com.michielherpers.linkedlists;

public class CustomLinkedList {

    Node head; //First Node
    Node tail; //Last Node
    int length;

    CustomLinkedList(Object value){
        //Create first Node
        this.tail = new Node(value, null);
        this.head = this.tail;
        this.length = 1;
    }

    void append(Object value){ //O(1)
        Node next = new Node(value, null);
        this.tail.next = next;
        this.tail = next;
        this.length++;
    }

    void prepend(Object value){ //O(1)
        Node post = new Node(value, this.head);
        this.head = post;
        this.length++;
    }

    void insert(int index, Object value){ //O(n)
        if(index >= this.length){
            this.append(value);
        }
        else if(index == 0){
            this.prepend(value);
        }
        else{
            Node indexNode = this.head;
            for(int i = 1; i < index; i++){ //O(n)
                indexNode = indexNode.next;
            }
            Node insertNode = new Node(value, indexNode.next); //point to where index is pointing to
            indexNode.next = insertNode; //Index point to new Node
        }
        this.length++;
    }

    void printLinkedList(){
        StringBuilder sb = new StringBuilder("[");
        int index = 0;
        Node indexNode = this.head;
        while(index < this.length) {
            sb.append(indexNode.value).append(" ");
            indexNode = indexNode.next;
            index++;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

}

class Node{

    Object value;
    int hashcode;
    Node next;

    Node(Object value, Node next){
        this.value = value;
        this.next = next;
        this.hashcode = this.hashCode();
    }
}
