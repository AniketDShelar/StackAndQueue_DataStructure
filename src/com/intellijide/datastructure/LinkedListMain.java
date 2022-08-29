package com.intellijide.datastructure;

import java.security.spec.RSAOtherPrimeInfo;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        LinkedList linkedList4 = new LinkedList();

        linkedList1.push(70);
        linkedList1.push(30);
        linkedList1.push(56);
        linkedList1.print();

        linkedList2.add(56);
        linkedList2.add(30);
        linkedList2.add(70);
        linkedList2.print();

        linkedList3.add(56);
        linkedList3.add(70);
        linkedList3.print();

        boolean isInserted = linkedList3.insertAfter(56,30);
        if(isInserted)
            System.out.println("Data Inserted Successfully");
        else
            System.out.println("Element not Inserted");

        linkedList3.print();

        linkedList3.popFirst();
        linkedList3.print();

        linkedList2.print();
        linkedList2.popLast();
        linkedList2.print();

        if(linkedList1.search(30) != null){
            System.out.println("Linked list 1 contain node you want to find");
        }else {
            System.out.println("Linked list 1 do not contain node you want to find");
        }

        boolean nodeInserted = linkedList1.insertAfter(30,40);
        if(nodeInserted)
            System.out.println("Data Inserted Successfully");
        else
            System.out.println("Element not Inserted");

        linkedList1.print();

        linkedList4.add(56);
        linkedList4.add(30);
        linkedList4.add(40);
        linkedList4.add(70);
        linkedList4.print();

        linkedList4.deleteNode(2);
        linkedList4.print();
        System.out.println("Size of Linkedlist -> " +linkedList4.countNodes());
    }
}
