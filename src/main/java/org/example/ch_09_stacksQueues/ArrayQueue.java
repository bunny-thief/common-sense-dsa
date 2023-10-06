package org.example.ch_09_stacksQueues;

import org.example.ch_14_nodeBasedDataStructures.Node;

public class ArrayQueue {

    private Node[] queue;
    private int tail;

    public ArrayQueue() {
        queue = new Node[5];
        tail = 0;
    }

    public void peek() {
        if (queue[0] != null) {
            System.out.println(queue[0]);
        }
    }

    public void enqueue(int data) {
        if (tail >= queue.length) {
            return;
        }

        Node node = new Node(data);
        queue[tail++] = node;
    }

    public Node dequeue() {
        if (queue[0] != null) {
            Node removedNode = queue[0];
            // shift all nodes left
            int index = 1;
            while (index < tail) {
                queue[index - 1] = queue[index];
                index++;
            }
            queue[--tail] = null;
            return removedNode;
        }
        return null;
    }

}
