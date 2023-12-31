
package com.company;

public class Node {
    private MyProcess myProcess;
    private Node left;
    private Node right;

    public Node(MyProcess myProcess) {
        this.myProcess = myProcess;
        this.left = null;
        this.right = null;
    }

    // Method to add a node in a binary tree
    public void addNode(MyProcess newProcess) {
        if (newProcess.getProcessId() < this.myProcess.getProcessId()) {
            if (this.left == null) {
                this.left = new Node(newProcess);
            } else {
                this.left.addNode(newProcess);
            }
        } else {
            if (this.right == null) {
                this.right = new Node(newProcess);
            } else {
                this.right.addNode(newProcess);
            }
        }
    }

    // Getters and Setters
    public MyProcess getMyProcess() {
        return myProcess;
    }

    public void setMyProcess(MyProcess myProcess) {
        this.myProcess = myProcess;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
