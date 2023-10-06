package org.example.ch_09_stacksQueues;

import org.example.ch_14_nodeBasedDataStructures.Node;

import java.util.Arrays;

public class ArrayQueue {

    private Node[] queue;
    private int tail;

    public ArrayQueue() {
        queue = new Node[5];
        tail = 0;
    }

}
