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

    public DLNode insert(int data) {
        DLNode node = new DLNode(data);
        if(getFirst() == null) {
            setFirst(node);
            return node;
        }

        node.setNext(first);
        setFirst(node);

        return node;
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
