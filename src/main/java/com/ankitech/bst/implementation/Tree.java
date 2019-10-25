package com.ankitech.bst.implementation;

public interface Tree<T> {
    Node<T> getRoot();
    void traversal();
    void insert(T data);
    void delete(T data);
    T getMax();
    T getMin();
    Node<T> getKSmallest(Node<T> node, int k);
}
