package com.ankitech.bst;

import com.ankitech.bst.implementation.BinarySearchTree;
import com.ankitech.bst.implementation.Tree;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CompareBSTTest {

    @Test
    public void compareTrees() {

        Tree<Integer> tree1 = new BinarySearchTree<>();
        Tree<Integer> tree2 = new BinarySearchTree<>();
        Tree<Integer> tree3 = new BinarySearchTree<>();

        tree1.insert(7);
        tree1.insert(5);
        tree1.insert(1);
        tree1.insert(6);
        tree1.insert(2);
        tree1.insert(9);

        tree2.insert(7);
        tree2.insert(5);
        tree2.insert(9);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(2);

        tree3.insert(9);
        tree3.insert(5);
        tree3.insert(1);
        tree3.insert(6);
        tree3.insert(2);
        tree3.insert(7);

        CompareBST<Integer> compareBST = new CompareBST<>();

        assertTrue(compareBST.compareTrees(tree1.getRoot(),tree2.getRoot()));
        assertFalse(compareBST.compareTrees(tree2.getRoot(),tree3.getRoot()));
    }
}