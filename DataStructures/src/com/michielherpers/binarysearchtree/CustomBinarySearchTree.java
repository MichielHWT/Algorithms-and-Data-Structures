package com.michielherpers.binarysearchtree;

public class CustomBinarySearchTree {

    Node root;

    CustomBinarySearchTree(int value){
        this.root = new Node(value);
    }

    void insert(int value){ //I don't think this is right. It will now never insert between two existing Nodes, only at the end

        Node treeLine = lookup(value);

        if(value < treeLine.getValue()){
            treeLine.setLeft(new Node(value));
        }
        else{
            treeLine.setRight(new Node(value));
        }
    }

    Node lookup(int value){ //Searches Node with value, or the parent Node where the value should be a child of
        Node treeLine = this.root;
        while(treeLine.getRight() != null || treeLine.getLeft() != null){

            if(value < treeLine.getValue() && treeLine.getLeft() != null){
                treeLine = treeLine.getLeft();
            }
            else if(value >= treeLine.getValue() && treeLine.getRight() != null){
                treeLine = treeLine.getRight();
            }
            else{
                break;
            }
        }
        return treeLine;
    }

    int remove(int value){
        Node treeLine = this.root;
        Node parent = null;
        boolean side = true; //left => true, right => false
        while(treeLine != null && treeLine.getValue() != value){
            parent = treeLine;
            if(value < treeLine.getValue()){
                treeLine = treeLine.getLeft();
                side = true;
            }
            else{ //value >= treeLine.getValue()
                treeLine = treeLine.getRight();
                side = false;
            }
        }
        if(treeLine == null) return -1; //Node with value does not exist in BST
        if(side){
            parent.setLeft(treeLine.getLeft());
        }
        else{
            parent.setRight(treeLine.getRight());
        } //After this statement, there is no more Node pointing to the Node with value, so it will be removed by garbage collection
        return 0;
    }

}

class Node{

    private Node right;
    private Node left;
    private int value;

    Node(int value){
        this.value = value;
        this.right = null;
        this.left = null;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}