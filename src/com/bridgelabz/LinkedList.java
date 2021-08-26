package com.bridgelabz;

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
       /* list.add(56);
        list.add(30);
        list.add(70);
        */
        list.append(56);
        list.append(70);
        list.append(30);
        list.pop();
        list.display();
    }
}
