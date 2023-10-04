package org.example.ch_14_nodeBasedDataStructures;

public class Main {

    public static void main(String[] args) {
        /*LinkedList linkedList = new LinkedList();
        linkedList.addFirst(5);
        System.out.println(linkedList.addFirst(4));
        System.out.println(linkedList.addLast(6));
        System.out.println(linkedList.addLast(7));
//        linkedList.reverseList(linkedList.getFirst());
        System.out.println(linkedList.getFirst());*/

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insertFirst(5);
        doublyLinkedList.insertFirst(4);
        doublyLinkedList.insertLast(6);
        doublyLinkedList.insertLast(8);

        doublyLinkedList.insertAt(7, 3, doublyLinkedList.getFirst());

//        doublyLinkedList.displayNodes();
        doublyLinkedList.displayNodesReverse();
    }

}
