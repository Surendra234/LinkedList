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