package org.example.ch_14_nodeBasedDataStructures;

public class DoublyLinkedList {

    private DLNode first;
    private DLNode last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public DLNode getFirst() {
        return first;
    }

    private void setFirst(DLNode first) {
        this.first = first;
    }

    private DLNode getLast() {
        return last;
    }

    private void setLast(DLNode last) {
        this.last = last;
    }

    public DLNode insertFirst(int data) {
        DLNode node = new DLNode(data);
        if(getFirst() == null) {
            setFirst(node);
            setLast(node);
            return node;
        }

        node.setNext(first);
        first.setPrevious(node);
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
            setLast(newNode);
            return newNode;
        }

        if (node.getNext() == null) {
            node.setNext(newNode);
            newNode.setPrevious(node);
            setLast(newNode);
            return newNode;
        }

        return insertLast(data, node.getNext());
    }

    public DLNode insertAt(int data, int index, DLNode node) {
        if (node == null || node.getNext() == null) {
            return null;
        }

        if (index == 1) {
            DLNode newNode = new DLNode(data);
            DLNode next = node.getNext();
            newNode.setPrevious(node);
            newNode.setNext(next);
            node.setNext(newNode);
            next.setPrevious(newNode);
            return newNode;
        }
        return insertAt(data, index - 1, node.getNext());
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

    public void displayNodesReverse() {
        displayNodesReverse(getLast());
    }

    public void displayNodesReverse(DLNode node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
        if (node.getPrevious() == null) {
            return;
        }
        displayNodesReverse(node.getPrevious());
    }

}
