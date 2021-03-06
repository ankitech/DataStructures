package com.ankitech.linkedlist.implementation;

public class LinkedList<T extends Comparable<T>> implements List<T> {

    private Node<T> root;
    private int sizeOfList;

    @Override
    public void insert(T data) {

        ++this.sizeOfList;

        if(root == null){
            this.root = new Node<>(data);
        }else {
            insertDataAtBeginning(data);
        }

    }

    //O(1)
    private void insertDataAtBeginning(T data) {

        Node<T> newNode =  new Node<>(data);
        newNode.setNextNode(root);
        this.root = newNode;
    }

    //O(n)
    private void insertDataAtEnd(T data, Node<T> node) {

        if(node.getNextNode() != null){
            insertDataAtEnd(data, node.getNextNode());
        }else{
            Node<T> newNode = new Node<>(data);
            node.setNextNode(newNode);
        }
    }

    @Override
    public void remove(T data) {

        if(this.root == null){
            return;
        }

        --this.sizeOfList;

        if (this.root.getData().compareTo(data) == 0){
            this.root = this.root.getNextNode();
        }else {
            remove(data, root, root.getNextNode());
        }

    }

    private void remove(T data, Node<T> previousNode, Node<T> actualNode) {
        while(actualNode != null){
            if(actualNode.getData().compareTo(data) == 0){
                previousNode.setNextNode(actualNode.getNextNode());
                return;
            }
            previousNode = actualNode;
            actualNode = actualNode.getNextNode();
        }
    }

    @Override
    public String traverseList() {
        if(this.root == null){
            return "";
        }

        Node<T> actualNode = this.root;

        StringBuilder stringBuilder = new StringBuilder();
        while(actualNode != null){
            System.out.print(actualNode + " -> ");
            stringBuilder.append(actualNode).append("-");
            actualNode = actualNode.getNextNode();
        }
        return stringBuilder.toString();
    }

    @Override
    public int size() {
        return this.sizeOfList;
    }

    public Node<T> getMiddle(){
        Node<T> fastPointer = this.root;
        Node<T> slowPointer = this.root;
        while(fastPointer.getNextNode() != null && fastPointer.getNextNode().getNextNode() != null){
            fastPointer = fastPointer.getNextNode().getNextNode();
            slowPointer = slowPointer.getNextNode();
        }
        return slowPointer;
    }

    public void reverseList(){
        Node<T> current = this.root;
        Node<T> next;
        Node<T> prev = null;

        while(current != null){
            next = current.getNextNode();
            current.setNextNode(prev);
            prev=current;
            current = next;
        }
        this.root = prev;
    }
}