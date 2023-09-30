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

    public void setLast(Node last) {
        this.last = last;
    }

    public Node addFirst(int data) {
        Node node = new Node(data);
        if (getFirst() == null) {
            setFirst(node);
            setLast(node);
        }
        node.setNext(first);
        setFirst(node);
        return node;
    }

    public Node addLast(int data) {
        Node node = new Node(data);
        Node last = getLast();
        last.setNext(node);
        setLast(node);
        return node;
    }

}
