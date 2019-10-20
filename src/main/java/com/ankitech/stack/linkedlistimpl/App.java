package com.ankitech.stack.linkedlistimpl;

public class App {

    public static void main(String[] args) {

        LinkedListStack<String> stringLinkedListStack = new LinkedListStack<>();
        stringLinkedListStack.push("Ankit");
        stringLinkedListStack.push("Smita");
        stringLinkedListStack.push("Nikhil");

        System.out.println(stringLinkedListStack.pop());
        System.out.println(stringLinkedListStack.pop());
        System.out.println(stringLinkedListStack.pop());
    }
}
