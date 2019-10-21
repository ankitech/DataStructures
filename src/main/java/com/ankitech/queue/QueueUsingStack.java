package com.ankitech.queue;

import com.ankitech.stack.arrayimpl.Stack;

public class QueueUsingStack<T> {

    Stack<T> enqueueStack = new Stack<>();
    Stack<T> dequeueStack = new Stack<>();

    public void enqueue(T data){
        enqueueStack.push(data);
    }

    public T dequeue() throws Exception {

        if(enqueueStack.size() ==0 && dequeueStack.size() ==0){
            throw new Exception("queue is empty");
        }

        if(dequeueStack.size() == 0){
            while(enqueueStack.size() > 0){
                dequeueStack.push(enqueueStack.pop());
            }
        }

        return dequeueStack.pop();

    }

}
