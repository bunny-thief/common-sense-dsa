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

    public TreeNode addNode(int data) {
        return addNode(data, root);
    }

    public TreeNode addNode(int data, TreeNode treeNode) {

        if (treeNode == null) {
            treeNode = new TreeNode(data);
            if (getRoot() == null) {
                root = treeNode;
            }
            return treeNode;
        }

        if (data < treeNode.getData()) {
            if (treeNode.getLeft() == null) {
                treeNode.setLeft(new TreeNode(data));
            } else {
                return addNode(data, treeNode.getLeft());
            }

        } else if (data > treeNode.getData()) {
            if (treeNode.getRight() == null) {
                treeNode.setRight(new TreeNode(data));
            } else {
                return addNode(data, treeNode.getRight());
            }
        }
        return null;
    }

    public void traverseInOrder() {
        traverseInOrder(getRoot());
    }

    public void traverseInOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        if (treeNode.getLeft() != null) {
            traverseInOrder(treeNode.getLeft());
        }

        System.out.println(treeNode);

        if (treeNode.getRight() != null) {
            traverseInOrder(treeNode.getRight());
        }
    }

}
