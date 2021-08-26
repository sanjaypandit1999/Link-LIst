package com.bridgelabz;

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(50);
        list.add(30);
        list.add(70);
        list.display();
    }
}

    class Node<T> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    class MyLinkedList<T> {
        Node node;
        Node tail;
        Node head;

        public void add(T data) {
            Node <T>newNode = new Node(data);
            if (head == null) {
                this.node = newNode;
                this.tail = newNode;
                this.head = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public void display() {
            Node <T>current = head;
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            System.out.println("Nodes of singly linked list:");
            while (current != null) {

                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
