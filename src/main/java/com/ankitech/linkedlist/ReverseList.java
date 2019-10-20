/*
Construct an in-place algorithm to reverse a linked list!
* */

package com.ankitech.linkedlist;

import com.ankitech.linkedlist.implementation.LinkedList;

public class ReverseList {

    public static void main(String[] args) {

        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.insert("Ankit");
        stringLinkedList.insert("Smita");
        stringLinkedList.insert("Jyoti");
        stringLinkedList.insert("Nitish");
        stringLinkedList.insert("Gloria");
        stringLinkedList.insert("Nikhil");
        stringLinkedList.insert("Ashu");
        System.out.println("orignal list");
        stringLinkedList.traverseList();

        stringLinkedList.reverseList();

        System.out.println("\nreversed list");
        stringLinkedList.traverseList();
    }
}
