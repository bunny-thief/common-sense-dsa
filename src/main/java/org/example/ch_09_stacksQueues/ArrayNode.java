package org.example.ch_09_stacksQueues;

public class ArrayNode {

    private int data;
    private int next;

    ArrayNode(int data) {
        this.data = data;
        next = 0;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("(%d)", getData());
    }

}
