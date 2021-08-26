package com.bridgelabz;
public  class MyLinkedList {
    Node head;
    Node tail;
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node tempNode = head;
            head= newNode;
            head.next = tempNode;
        }
    }
    public void display(){
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.println(current.data + " ");
                current = current.next;
            }
        }
    }
}