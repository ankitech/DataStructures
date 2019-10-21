/*
The aim is to design an algorithm that can return the maximum item of a stack in O(1)
running time complexity. We can use O(N) extra memory!
*/

package com.ankitech.stack;

import java.util.Stack;

public class MaximumItem <T extends Comparable<T>> {

    private Stack<T> mainStack;
    private Stack<T> maxStack;

    public MaximumItem() {
        this.mainStack = new Stack<>();
        this.maxStack = new Stack<>();
    }

    public void push(T item){

        mainStack.push(item);

        if(mainStack.size() == 1){
            maxStack.push(item);
            return;
        }

        if(item.compareTo(maxStack.peek()) > 0){
            maxStack.push(item);
        }else {
            maxStack.push(maxStack.peek());
        }
    }

    public T pop(){
        maxStack.pop();
        return mainStack.pop();
    }

    public T getMax(){
        return maxStack.peek();
    }
}
