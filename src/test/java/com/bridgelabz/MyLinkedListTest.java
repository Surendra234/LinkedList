package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {

    MyLinkedList myLinkedList = new MyLinkedList();
    @Test
    public void given_3_numbers_when_linked_should_passed_linked_list_test() {

        System.out.println("\nTest Case 2 : Ability To Add 30 and 56 to 70");
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);

        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFirstNode);

        Assertions.assertTrue(result);
    }

    @Test
    public void given_3_numbers_when_append_to_linked_list_should_be_added_last() {

        System.out.println("\nTest Case 3 : Ability To Append 30 and 70 To 56");
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);

        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);

        Assertions.assertTrue(result);
    }

    @Test
    public void given_3_when_append_to_linked_list_one_number_should_be_insert_in_middle() {

        System.out.println("\nTest Case 4 : Ability To Insert 30 Between 56 and 70");
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);

        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);

        Assertions.assertTrue(result);
    }

    @Test
    public void given_3_number_when_append_to_linked_list_first_element_should_be_deleted() {

        System.out.println("\nTest 5 : Ability To Delete First Element");
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.pop();

        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.head.getNext().equals(myThirdNode);

        Assertions.assertTrue(result);
    }

    @Test
    public void given_3_number_when_append_to_linked_list_last_element_should_be_deleted() {

        System.out.println("\nTest 6 : Ability To Delete last Element");
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);


        MyLinkedList myLinkedList = new MyLinkedList();

        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.popLast();

        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode);

        Assertions.assertTrue(result);
    }
}