package com.ankitech.queue.linkedlistimpl;

public class Node<T extends Comparable<T>> {

    Node<T> nextNode;
    T data;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
