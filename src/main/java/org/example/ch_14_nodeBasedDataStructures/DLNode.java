package org.example.ch_14_nodeBasedDataStructures;

public class DLNode {

    private int data;
    private DLNode next;
    private DLNode previous;

    public DLNode(int data) {
        this.data = data;
        next = null;
        previous = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DLNode getNext() {
        return next;
    }

    public void setNext(DLNode next) {
        this.next = next;
    }

    public DLNode getPrevious() {
        return previous;
    }

    public void setPrevious(DLNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return String.format("(%d)", getData());
    }
}
