package org.example.ch_14_nodeBasedDataStructures;

public class DLNode extends Node {

    private Node previous;

    public DLNode(int data) {
        super(data);
        previous = null;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

}
