package com.dsa.datastructures.linkedlists;

public class Main {

    public static void main(String[] args) {

        // linked list operations
        LinkedList linkedList = new LinkedList();


        // insertion
        linkedList.insertAtFront(2);
        linkedList.insertAtFront(1);
        linkedList.insertAtEnd_UsingTail(5);
        linkedList.insertAtEnd(10);
        linkedList.insertAtIndex(1, 22);

        linkedList.print();
        // deletion
        linkedList.deleteFromFront();
        linkedList.delete(100);

        linkedList.print();

        // circular linked list operations
        CircularLinkedList circularLinkedList = new CircularLinkedList();

        // insertion
        circularLinkedList.insertAtEnd(1);
        circularLinkedList.insertAtEnd(2);
        circularLinkedList.insertAtEnd(3);
        circularLinkedList.insertAtFront(4);

        circularLinkedList.print();

        // deletion
        circularLinkedList.delete(4);

        circularLinkedList.print();

        // deletion from front
        circularLinkedList.deleteFromFront();

        circularLinkedList.print();

        // deletion from end
        circularLinkedList.deleteFromEnd();

        circularLinkedList.print();

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insertAt(0, 101);
        doublyLinkedList.insertAt(1, 111);
        doublyLinkedList.insertAt(2, 10111);

        doublyLinkedList.print();
    }
}

