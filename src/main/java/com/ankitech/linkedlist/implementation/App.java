package com.ankitech.linkedlist.implementation;

public class App {

    public static void main(String[] args) {


        List<Integer> numberList = new LinkedList<>();

        numberList.insert(10);
        numberList.insert(-4);
        numberList.insert(11);
        numberList.insert(1);
        numberList.insert(12);
        numberList.insert(18);
        numberList.insert(14);

        numberList.remove(18);

        numberList.traverseList();


        List<String> stringList = new LinkedList<>();

        stringList.insert("Ankit");
        stringList.insert("Smita");
        stringList.insert("Dev");
        stringList.insert("someone");
        stringList.insert("another");

        stringList.traverseList();

    }
}
