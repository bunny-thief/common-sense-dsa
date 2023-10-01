package org.example.ch_15_binarySearchTrees;

public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree() {
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(int data) {
        root = new TreeNode(data);
    }

}
