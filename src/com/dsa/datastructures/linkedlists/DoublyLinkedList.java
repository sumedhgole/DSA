package com.dsa.datastructures.linkedlists;

public class DoublyLinkedList {

    private Node head;

    private static class Node {

        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
    }

    public void insertAt(int index, int value) {

        Node newNode = new Node(value);


        if (index == 0) {

            newNode.next = this.head;
            if (this.head != null) {
                this.head.prev = newNode;
            }
            this.head = newNode;

        } else {

            Node currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                if(currentNode == null) {
                    break;
                }
                currentNode = currentNode.next;
            }

            newNode.next = currentNode.next;
            newNode.prev = currentNode;
            currentNode.next = newNode;

            if(newNode.next != null) {
                newNode.next.prev = newNode;
            }


        }
    }

    public void print() {

        Node currentNode = this.head;

        if(currentNode == null) {
            System.out.println("NULL");
            return;
        }

        System.out.println("Doubly Linked List:");

        while(currentNode != null) {

            System.out.print(currentNode.value);
            if(currentNode.next != null) {
                System.out.print("<->");
            }
            currentNode = currentNode.next;
        }

        System.out.println();
    }

}
