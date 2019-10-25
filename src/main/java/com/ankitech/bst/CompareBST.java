/*Write an efficient algorithm thats able to compare two binary search trees.
The method returns true if the trees are identical (same topology with same values in the nodes)
otherwise it returns false.
*/

package com.ankitech.bst;

import com.ankitech.bst.implementation.Node;

public class CompareBST<T extends Comparable<T>> {

    public boolean compareTrees(Node<T> tree1, Node<T> tree2){
        //we check if both trees are blank
        if(tree1 ==null || tree2==null){
            return tree1==tree2;
        }

        //node has values then we compare the values
        if(tree1.getData().compareTo(tree2.getData()) != 0){
            return false;
        }

        //comapre the left and right subtrees
        return compareTrees(tree1.getLeftNode(), tree2.getLeftNode())
                && compareTrees(tree1.getRightNode(), tree2.getRightNode());
    }
}
