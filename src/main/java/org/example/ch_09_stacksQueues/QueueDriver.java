package org.example.ch_09_stacksQueues;

public class QueueDriver {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.peek();
        queue.pop();
        queue.peek();
        queue.pop();
        queue.peek();

    }
}
