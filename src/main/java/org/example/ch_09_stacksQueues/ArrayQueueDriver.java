package org.example.ch_09_stacksQueues;

public class ArrayQueueDriver {

    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();

        arrayQueue.enqueue(1);
        arrayQueue.enqueue(2);
        arrayQueue.enqueue(3);
        arrayQueue.enqueue(4);
        arrayQueue.enqueue(5);

        arrayQueue.peek();
        arrayQueue.dequeue();
        arrayQueue.peek();
        arrayQueue.dequeue();
        arrayQueue.peek();
        arrayQueue.dequeue();
        arrayQueue.peek();
        arrayQueue.dequeue();
        arrayQueue.peek();
        arrayQueue.dequeue();
        arrayQueue.peek();
    }

}
