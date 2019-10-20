package com.ankitech.stack.linkedlistimpl;

public class LinkedListStack<T extends Comparable<T>> {

    private Node<T> root;
    private int count;

    public void push(T newData){

        this.count++;
        if(this.root == null){
            this.root = new Node<>(newData);
        }else{
            Node<T> oldRoot = this.root;
            this.root = new Node<>(newData);
            this.root.setNextNode(oldRoot);
        }
    }

    //O(1)
    public T pop(){
        T item = this.root.getData();
        this.root = this.root.getNextNode();
        this.count--;
        return item;
    }

    //O(1)
    public int size() {
        return this.count;
    }

    //O(1)
    public boolean isEmpty() {
        return this.root == null;
    }
}
