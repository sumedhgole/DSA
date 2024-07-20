package com.dsa.datastructures.linkedlists;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    private static class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtFront(int value) {

        Node newNode = new Node(value);

        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
            this.head = newNode;
            this.tail.next = newNode;
        }
    }

    public void insertAtEnd(int value) {

        Node newNode = new Node(value);

        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }

        this.tail = newNode;
        newNode.next = head;

    }

    public void delete(int value) {

        Node currentNode = this.head;

        if(currentNode == null) {
            return;
        } else if(currentNode.value == value) {
            if(currentNode == this.tail) {
                this.head = null;
            } else {
                this.head = currentNode.next;
            }
            this.tail.next = this.head;
        } else {
            while(currentNode != this.tail)  {

                if(currentNode.next.value == value) {

                    if(currentNode.next == this.tail) {
                        this.tail = currentNode;
                    }
                    currentNode.next = currentNode.next.next;
                    return;
                }
                currentNode = currentNode.next;
            }
        }

    }

    public void print() {

        Node currentNode = this.head;

        if (this.head == null) {
            System.out.println("NULL");
            return;
        }

        System.out.println("Circular Linked List:");

        while (currentNode != tail) {

            System.out.print(currentNode.value);
            if (currentNode != tail) {
                System.out.print("->");
            }
            currentNode = currentNode.next;
        }

        System.out.print(currentNode.value + "->" + this.head.value + "(HEAD)");
        System.out.println();
    }

}
