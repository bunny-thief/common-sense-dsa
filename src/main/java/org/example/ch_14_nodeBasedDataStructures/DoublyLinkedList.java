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

}
