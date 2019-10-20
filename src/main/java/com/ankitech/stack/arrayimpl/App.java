package com.ankitech.stack.arrayimpl;

public class App {

    public static void main(String[] args) {

        Stack<String> stringStack = new Stack<>();

        stringStack.push("Ankit");
        stringStack.push("Smita");
        stringStack.push("Nikhil");
        stringStack.push("Varun");

        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
    }
}
