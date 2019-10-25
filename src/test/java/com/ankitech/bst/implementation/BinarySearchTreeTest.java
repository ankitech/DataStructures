package com.ankitech.bst.implementation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {

    @Test
    public void getKSmallest() {

        Tree<Integer> tree1 = new BinarySearchTree<>();

        tree1.insert(7);
        tree1.insert(5);
        tree1.insert(1);
        tree1.insert(6);
        tree1.insert(2);
        tree1.insert(9);

        assertEquals(Integer.valueOf(5), tree1.getKSmallest(tree1.getRoot(),3).getData());
    }
}