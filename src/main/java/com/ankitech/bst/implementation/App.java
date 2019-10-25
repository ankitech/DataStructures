package com.ankitech.bst.implementation;

public class App {

    public static void main(String[] args) {

        Tree<Integer> bst = new BinarySearchTree<>();

        bst.insert(10);
        bst.insert(5);
        bst.insert(7);
        bst.insert(-1);
        bst.insert(78);
        bst.insert(12);

        bst.delete(10);

        bst.traversal();

    }
}
