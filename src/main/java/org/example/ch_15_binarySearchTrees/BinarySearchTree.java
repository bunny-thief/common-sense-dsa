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

    public boolean search(int data) {
        return search(data, getRoot());
    }

    public boolean search(int data, TreeNode treeNode) {
        if (treeNode == null) {
            return false;
        }

        if (treeNode.getData() == data) {
            return true;
        }

        if (data < treeNode.getData()) {
            return search(data, treeNode.getLeft());
        }

        return search(data, treeNode.getRight());
    }

    public int min() {
        return min(0, getRoot());
    }

    public int min(int min, TreeNode treeNode) {
        if (treeNode.getLeft() == null) {
            return treeNode.getData();
        }

        return min(0, treeNode.getLeft());
    }

    public int max() {
        return max(0, getRoot());
    }

    public int max(int max, TreeNode treeNode) {
        if (treeNode.getRight() == null) {
            return treeNode.getData();
        }
        return max(0, treeNode.getRight());
    }

}
