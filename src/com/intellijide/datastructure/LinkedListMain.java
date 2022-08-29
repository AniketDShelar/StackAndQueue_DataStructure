package com.intellijide.datastructure;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();

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
    }
}
