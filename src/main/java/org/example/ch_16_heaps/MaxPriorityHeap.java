package org.example.ch_16_heaps;

public class MaxPriorityHeap {

    private int[] heap;
    private int last;

    public MaxPriorityHeap() {
        heap = new int[15];
        last = 0;
    }

    private int getRoot() {
        return heap[0];
    }

    private int getLast() {
        return heap[last];
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

    public void insert(int data) {
        int index = last;
        heap[index] = data;

        while (index > 0 && data > heap[getParent(index)]) {
            int temp = heap[getParent(index)];
            heap[getParent(index)] = data;
            heap[index] = temp;
            index = getParent(index);
        }
        last++;
    }

}
