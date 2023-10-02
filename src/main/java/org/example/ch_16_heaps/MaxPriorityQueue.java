package org.example.ch_16_heaps;

import org.example.ch_14_nodeBasedDataStructures.Node;

public class MaxPriorityQueue {

    private int[] heap;
    private int last;

    public MaxPriorityQueue() {
        heap = new int[15];
        last = 0;
    }

}
