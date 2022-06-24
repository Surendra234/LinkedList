package com.bridgelabz;

public class MyLinkedList {

    INode head;
    INode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Add Method
    public void add(INode newNode) {

        if(this.head == null)
            this.head = newNode;

        if(this.tail == null)
            this.tail = newNode;
        else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    // Append Method
    public void append(INode newNode) {

        if(this.head == null)
            this.head = newNode;
        if(this.tail == null)
            this.tail = newNode;
        else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }

    // Insert Method
    public void insert(INode myFirstNode, INode newNode) {

        INode tempNode = myFirstNode.getNext();
        myFirstNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    // Pop Method to delete the
    public INode pop() {

        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    // Pop method to delete the last element
    public INode popLast() {

        INode secondLastNode = this.head;
        while (secondLastNode.getNext().getNext() != null)
            secondLastNode = secondLastNode.getNext();
        secondLastNode.setNext(null);
        return this.head;
    }

    // Search Method
    public boolean search(INode node) {

        INode tempNode = head;
        boolean found = false;
        while (tempNode.getNext() != null) {
            if(tempNode.getKey() == node.getKey()) {
                found = true;
            }
            tempNode = tempNode.getNext();
        }
        return found;
    }

    // Method to Search and Insert the element
    public void searchAndInsert(INode searchNode, INode insertNode) {

        MyLinkedList node = new MyLinkedList();
        INode tempNode = head;
        boolean insert = false;
        while (tempNode.getNext() != null) {
            if(tempNode.getKey() == searchNode.getKey()) {
                node.insert(searchNode,insertNode);
            }
            tempNode = tempNode.getNext();
        }
    }

    //Print Method
    public void printMyNode() {

        StringBuffer myNode = new StringBuffer("My Node : ");

        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNode.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNode.append("->");
            tempNode = tempNode.getNext();
        }
        myNode.append(tempNode.getKey());
        System.out.println(myNode +"\n");
    }
}