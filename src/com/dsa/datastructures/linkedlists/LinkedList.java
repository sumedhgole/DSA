package com.dsa.datastructures.linkedlists;

public class LinkedList {

    private static class Node {

        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtFront(int value)  {

        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

    }

    public void insertAtEnd(int value) {

        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {

            Node currentNode = head;

            while(currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
            tail = newNode;
        }

        return;
    }

    public void insertAtEnd_UsingTail(int value) {

        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;

        return;
    }

    public void insertAtIndex(int index, int value) {

        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node currentNode = head;
            int count = 0;

            if(index <= 0) {
                insertAtFront(value);
                return;
            }

//            while(currentNode.next != null && count != index-1) {
//                currentNode = currentNode.next;
//                count++;
//            }

            for(int currPos = 0; currPos < index - 1; currPos++) {

                if(currentNode.next == null) {
                    break;
                } else {
                    currentNode = currentNode.next;
                }
            }

            if(currentNode.next == null) {
                currentNode.next = newNode;
                tail = newNode;
            } else {
                newNode.next = currentNode.next;
                currentNode.next = newNode;
            }
        }

    }

    public void printLinkedList() {
        Node currentNode = head;

        if(head == null) {
            System.out.println("NULL");
            return;
        }

        while(currentNode != null) {
            System.out.println(currentNode.value);
            currentNode = currentNode.next;
        }
        return;
    }

    public void delete(int value) {

    }

    public void deleteFromFront() {
        Node currentNode = head;

        if(currentNode == null) {
            return;
        } else if(currentNode.next == null) {
            head = null;
            tail = null;
        } else {
            head = currentNode.next;
            currentNode.next = null;
        }
    }


}

