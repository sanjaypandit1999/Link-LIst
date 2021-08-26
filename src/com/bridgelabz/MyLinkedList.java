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
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        }else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = newNode;
        }
    }
    public void insertAt(int index, int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void pop(){
        if (head != null)
        head = head.next;
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