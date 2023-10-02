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

    public int delete() {

        int max = heap[0];

        int index = 0;
        heap[index] = heap[--last];

        while (hasGreaterChild(index)) {
            int largestChildIndex = getLargestChildIndex(index);
            int temp = heap[largestChildIndex];
            heap[largestChildIndex] = heap[index];
            heap[index] = temp;
            index = largestChildIndex;
        }

        return max;
    }

    private boolean hasGreaterChild(int index) {
        return heap[getLeft(index)] > heap[index] && heap[getRight(index)] > heap[index];
    }

    private int getLargestChildIndex(int index) {
        return heap[getLeft(index)] > heap[getRight(index)] ? getLeft(index) : getRight(index);
    }

    public int getMax() {
        return heap[0];
    }

}
