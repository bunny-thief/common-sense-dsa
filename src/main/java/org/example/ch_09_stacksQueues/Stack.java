package org.example.ch_09_stacksQueues;

public class Stack {

    private String[] stack;
    private int index;

    public Stack() {
        stack = new String[10];
    }

    public void push(String str) {
        if (index < stack.length - 1) {
            stack[index++] = str;
        }
    }

    public String pop() {
        String str;
        if (index > 0) {
            str = stack[--index];
        } else {
            str = stack[0];
        }
        return str;
    }

    public void peek() {
        if (index > 0) {
            System.out.println(stack[index - 1]);
        }
    }

}
