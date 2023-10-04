package org.example.ch_14_nodeBasedDataStructures;

public class DoublyLinkedList {

    private DLNode first;

    public DoublyLinkedList() {
        first = null;
    }

    public DLNode getFirst() {
        return first;
    }

    private void setFirst(DLNode first) {
        this.first = first;
    }

    public DLNode insertFirst(int data) {
        DLNode node = new DLNode(data);
        if(getFirst() == null) {
            setFirst(node);
            return node;
        }

        node.setNext(first);
        setFirst(node);

        return node;
    }

    public DLNode insertLast(int data) {
        return insertLast(data, getFirst());
    }

    public DLNode insertLast(int data, DLNode node) {
        DLNode newNode = new DLNode(data);

        if (node == null && getFirst() == null) {
            setFirst(newNode);
            return newNode;
        }

        if (node.getNext() == null) {
            node.setNext(newNode);
            newNode.setPrevious(node);
            return newNode;
        }

        return insertLast(data, node.getNext());
    }

    public void displayNodes() {
        displayNodes(getFirst());
    }

    public void displayNodes(DLNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
        if (node.getNext() == null) {
            return;
        }
        displayNodes(node.getNext());
    }

}
