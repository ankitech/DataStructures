package com.ankitech.stack.DijkstraInterpretor;

import java.util.Arrays;
import java.util.Stack;

public class DijkstraInterpreterImplementation {

    public static long algorithm(String expression){
        Stack<String> operations = new Stack<>();
        Stack<Long> values = new Stack<>();
        String[] split = expression.split(" ");

        Arrays.stream(split).forEach(token -> {
            if(token.equals("(")){}
            else if(token.equals("+")){
                operations.push(token);
            }
            else if(token.equals("*")){
                operations.push(token);
            }
            else if(token.equals(")")){
                String operation = operations.pop();
                if(operation.equals("+")) {
                    values.push(values.pop() + values.pop());
                }else if(operation.equals("*")) {
                    values.push(values.pop() * values.pop());
                }
            }else {
                values.push(Long.parseLong(token));
            }
        });

        return values.pop();
    }
}
