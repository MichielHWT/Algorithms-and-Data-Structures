package com.michielherpers.searching.bfs;

import com.sun.source.tree.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreadthFirstSearch {

    /*
        Go through a tree from root node, than the level underneath from left to right

        Save the nodes that are visited, and which have to be visited again, to further look at the child nodes

        Use a Queue data structure for the Nodes of every level to save which Node will be first to look at for the
        child nodes

     */

    public static void main(String[] args) {

        //BinaryTree tree

    }

    static void breadthFirstSearch(){

        Queue queue = new ArrayDeque();
        //queue.add(Node); //add root

        while(!queue.isEmpty()){
            //Every time a node in the queue has been visited to look at child nodes, node is removed from queue
            //Node = queue.poll(); //returns the head of the queue

            //queue.add.Node

            //This queue can become really big with a wide tree --> memory problems

            //Use recursion

        }
    }
}
