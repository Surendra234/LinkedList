package com.bridgelabz;

import java.util.LinkedList;

public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);

        System.out.println(linkedList.get(0) + " -> " +linkedList.get(1) + " -> " +linkedList.get(2));
    }
}