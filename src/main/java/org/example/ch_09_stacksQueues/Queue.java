package org.example.ch_09_stacksQueues;

import org.example.ch_14_nodeBasedDataStructures.LinkedList;
import org.example.ch_14_nodeBasedDataStructures.Node;

public class Queue {

    private LinkedList queue;
    private Node head;
    private Node tail;

    public Queue() {
        queue = new LinkedList();
        head = queue.getFirst();
        tail = queue.getLast();
    }

    public Queue(LinkedList queue) {
        this.queue = queue;
        head = queue.getFirst();
        tail = queue.getLast();
    }

    private Node getHead() {
        return head;
    }

    private void setHead(Node head) {
        this.head = head;
    }

    private Node getTail() {
        return tail;
    }

    private void setTail(Node tail) {
        this.tail = tail;
    }

    public void push(int data) {
        Node node = new Node(data);
        if (getTail() == null) {
            setTail(node);

            if (getHead() == null) {
                setHead(node);
            }
            return;
        }

        tail.setNext(node);
        setTail(node);
    }

}
