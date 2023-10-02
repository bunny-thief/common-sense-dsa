package org.example.ch_16_heaps;

public class MaxPriorityHeapDriver {

    public static void main(String[] args) {
        MaxPriorityHeap maxPriorityHeap = new MaxPriorityHeap();
        maxPriorityHeap.insert(100);
        maxPriorityHeap.insert(88);
        maxPriorityHeap.insert(25);
        maxPriorityHeap.insert(87);
        maxPriorityHeap.insert(16);
        maxPriorityHeap.insert(8);
        maxPriorityHeap.insert(12);
//        System.out.println(maxPriorityHeap.getMax());

        System.out.println(maxPriorityHeap.delete());
        System.out.println(maxPriorityHeap.delete());
        System.out.println(maxPriorityHeap.delete());
        System.out.println(maxPriorityHeap.delete());
        System.out.println(maxPriorityHeap.delete());
        System.out.println(maxPriorityHeap.delete());
        System.out.println(maxPriorityHeap.delete());

//        System.out.println(maxPriorityHeap.getMax());

    }

}
