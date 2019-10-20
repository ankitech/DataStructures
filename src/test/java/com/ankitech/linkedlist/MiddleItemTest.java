package com.ankitech.linkedlist;

import com.ankitech.linkedlist.implementation.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleItemTest {

    @Test
    public void middleItemTest() {

        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.insert("Ankit");
        stringLinkedList.insert("Smita");
        stringLinkedList.insert("Jyoti");
        stringLinkedList.insert("Nitish");
        stringLinkedList.insert("Gloria");
        stringLinkedList.insert("Nikhil");
        stringLinkedList.insert("Ashu");

        assertEquals("Nitish",stringLinkedList.getMiddle().getData());
    }
}