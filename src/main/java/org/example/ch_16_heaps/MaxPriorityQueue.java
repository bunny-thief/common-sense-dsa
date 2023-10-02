package org.example.ch_16_heaps;

import org.example.ch_14_nodeBasedDataStructures.Node;

public class MaxPriorityQueue {

    private int[] heap;
    private int last;

    public MaxPriorityQueue() {
        heap = new int[15];
        last = 0;
    }

    private int getLeft(int index) {
        return (index * 2) + 1;
    }

    private int getRight(int index) {
        return (index * 2) + 2;
    }

    private int getParent(int index) {
        return (index - 1) / 2;
    }

}
