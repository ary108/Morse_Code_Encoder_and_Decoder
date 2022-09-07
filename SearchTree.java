package com.company;

public class SearchTree {
    private IntTreeNode overallRoot;   // null for an empty tree

    public SearchTree() {
    }

    public SearchTree(IntTreeNode overallRoot) {
        this.overallRoot = overallRoot;
    }

    public SearchTree(String value) {
        overallRoot = new IntTreeNode(value);
    }

    public IntTreeNode getOverallRoot() {
        return overallRoot;
    }

    public void setOverallRoot(IntTreeNode overallRoot) {
        this.overallRoot = overallRoot;
    }

    public void print() {
        print(overallRoot);
        System.out.println();   // end the line of output
    }

    private void print(IntTreeNode root) {
        // (base case is implicitly to do nothing on null)
        if (root != null) {
            // recursive case: print left, center, right
            print(root.left);
            System.out.print(root.data + " ");
            print(root.right);
        }
    }

    // Prints the tree in a sideways indented format.
    public void printSideways() {
        printSideways(overallRoot, "");
    }

    private void printSideways(IntTreeNode root, String indent) {
        if (root != null) {
            printSideways(root.right, indent + "    ");
            System.out.println(indent + root.data);
            printSideways(root.left, indent + "    ");
        }
    }
}
