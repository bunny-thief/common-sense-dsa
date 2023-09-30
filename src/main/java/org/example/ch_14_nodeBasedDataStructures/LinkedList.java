package org.example.ch_14_nodeBasedDataStructures;

public class LinkedList {

    private Node first;
    private Node last;

    public LinkedList() {
        first = null;
        last = null;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

}
