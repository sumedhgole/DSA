package com.dsa.datastructures.linkedlists;

public class Main {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();


        // insertion
        linkedList.insertAtFront(2);
        linkedList.insertAtFront(1);
        linkedList.insertAtEnd_UsingTail(5);
        linkedList.insertAtEnd(10);
        linkedList.insertAtIndex(1, 22);

        linkedList.printLinkedList();
        // deletion
        linkedList.deleteFromFront();
        linkedList.delete(100);

        linkedList.printLinkedList();
    }
}

