package com.ankitech.bst;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {

    private Node<T> root;

    @Override
    public void insert(T data){
        if(root == null){
            root = new Node<>(data);
        }else{
            insertNode(data, root);
        }
    }

    @Override
    public T getMin(){
        if(root == null) {
            return null;
        }else {
            return getMin(root);
        }
    }

    @Override
    public T getMax(){
        if(root == null) {
            return null;
        }else {
            return getMax(root);
        }
    }

    @Override
    public void traversal() {
        inOrderTraversal(root);
    }

    @Override
    public void delete(T data) {
        if(root != null){
            delete(root, data);
        }
    }

    private void insertNode(T newData, Node<T> node) {

        if(newData.compareTo(node.getData()) < 0){
            if(node .getLeftNode() != null){
                insertNode(newData, node.getLeftNode());
            }else{
                Node<T> newNode = new Node<>(newData);
                node.setLeftNode(newNode);
            }
        }else {
            if(node .getRightNode() != null){
                insertNode(newData, node.getRightNode());
            }else{
                Node<T> newNode = new Node<>(newData);
                node.setRightNode(newNode);
            }
        }

    }

    private T getMax(Node<T> node) {
        if (node.getRightNode() != null){
            return getMax(node.getRightNode());
        }
        return node.getData();
    }

    private T getMin(Node<T> node) {
        if (node.getLeftNode() != null){
            return getMin(node.getLeftNode());
        }
        return node.getData();
    }

    private void inOrderTraversal(Node<T> node){
        if(node.getLeftNode() != null){
            inOrderTraversal(node.getLeftNode());
        }

        System.out.print(node + "--> ");

        if(node.getRightNode() != null){
            inOrderTraversal(node.getRightNode());
        }
    }

    private Node<T> delete(Node<T> node, T data){
        if(node == null){
            return node;
        }

        if(data.compareTo(node.getData()) < 0){
            node.setLeftNode(delete(node.getLeftNode(), data));
        }else if(data.compareTo(node.getData()) > 0){
            node.setRightNode(delete(node.getRightNode(), data));
        }else {

            //we have found the node we want to remove
            if(node.getLeftNode() == null && node.getRightNode() == null){
                System.out.println("removing node");
                return null;
            }

            if(node.getLeftNode() == null){
                System.out.println("removing the right child");
                Node<T> tempNode = node.getRightNode();
                node = null;
                return tempNode;
            }else if(node.getRightNode() == null){
                System.out.println("removing the left child");
                Node<T> tempNode = node.getLeftNode();
                node = null;
                return tempNode;
            }

            //this is the node with two children
        }

        return null;
    }
}
