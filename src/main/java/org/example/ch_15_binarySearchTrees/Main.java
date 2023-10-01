package org.example.ch_15_binarySearchTrees;

public class Main {

    public static void main(String[] args) {

        var bst = new BinarySearchTree();
        bst.addNode(50);
        bst.addNode(85);
        bst.addNode(25);
        bst.addNode(15);
        bst.addNode(30);
        bst.addNode(75);

        bst.traverseInOrder();
        System.out.printf("Search 30 - %b\n", bst.search(30));
        System.out.printf("Search 84 - %b\n", bst.search(84));
        System.out.printf("Min: %d\n", bst.min());
        System.out.printf("Max: %d\n", bst.max());

    }

}
