package org.example.ch_14_nodeBasedDataStructures;

public class DoublyLinkedList {

    private DLNode first;

    public DoublyLinkedList() {
        first = null;
    }

    private DLNode getFirst() {
        return first;
    }

    private void setFirst(DLNode first) {
        this.first = first;
    }
    
}
