/*
Suppose we have a standard linked list.
Construct an in-place (without extra memory) algorithm thats able to find the middle node !
* */

package com.ankitech.linkedlist;

import com.ankitech.linkedlist.implementation.LinkedList;

public class MiddleItem {

    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.insert("Ankit");
        stringLinkedList.insert("Smita");
        stringLinkedList.insert("Jyoti");
        stringLinkedList.insert("Nitish");
        stringLinkedList.insert("Gloria");
        stringLinkedList.insert("Nikhil");
        stringLinkedList.insert("Ashu");

        System.out.println(stringLinkedList.getMiddle().getData());
    }

}
