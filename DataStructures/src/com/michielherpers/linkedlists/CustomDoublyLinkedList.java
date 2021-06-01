package com.michielherpers.linkedlists;

public class CustomDoublyLinkedList{

    DoublyNode head; //First Node
    DoublyNode tail; //Last Node
    int length;

    CustomDoublyLinkedList(Object value){
        //Create first Node
        this.tail = new DoublyNode(value, null, null);
        this.head = this.tail;
        this.length = 1;
    }

    void append(Object value){ //O(1)
        DoublyNode next = new DoublyNode(value, null, this.tail);
        this.tail.next = next;
        this.tail = next;
        this.length++;
    }

    void prepend(Object value){ //O(1)
        DoublyNode post = new DoublyNode(value, this.head, null);
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
            DoublyNode indexNode = this.head;
            for(int i = 1; i < index; i++){ //O(n)
                indexNode = indexNode.next;
            }
            DoublyNode insertNode = new DoublyNode(value, indexNode.next, indexNode); //point to where index is pointing to
            indexNode.next = insertNode; //Index point to new Node
        }
        this.length++;
    }

    void printLinkedList(){
        StringBuilder sb = new StringBuilder("[");
        int index = 0;
        DoublyNode indexNode = this.head;
        while(index < this.length) {
            sb.append(indexNode.value).append(" ");
            indexNode = indexNode.next;
            index++;
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}

class DoublyNode{

    Object value;
    int hashcode;
    DoublyNode next;
    DoublyNode previous;

    DoublyNode(Object value, DoublyNode next, DoublyNode previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
        this.hashcode = this.hashCode();
    }
}
