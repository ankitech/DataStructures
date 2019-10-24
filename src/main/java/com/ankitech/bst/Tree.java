package com.ankitech.bst;

public interface Tree<T> {
    void traversal();
    void insert(T data);
    void delete(T data);
    T getMax();
    T getMin();
}
