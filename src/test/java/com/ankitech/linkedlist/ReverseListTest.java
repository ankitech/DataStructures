package com.ankitech.linkedlist;

import com.ankitech.linkedlist.implementation.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseListTest {

    @Test
    public void reverseListTest() {
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.insert("Ankit");
        stringLinkedList.insert("Smita");
        stringLinkedList.insert("Nikhil");
        stringLinkedList.insert("Ashu");
        stringLinkedList.reverseList();

        assertEquals("Ankit-Smita-Nikhil-Ashu-", stringLinkedList.traverseList());


    }
}