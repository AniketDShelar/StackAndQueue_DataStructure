package com.intellijide.datastructure;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;
    public void push(E key) {
        Node<E> newNode = new Node<>(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
        }
    }
    public void add(E key){
        Node<E> newNode = new Node<>(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public Node<E> search(E searchData){
        Node<E> temp = head;
        while(temp != null){
            if(temp.getKey().equals(searchData))
                return temp;
                temp = temp.getNext();
        }
        return null;
    }
    public boolean insertAfter(E searchData, E insertData){
        Node<E> newNode = new Node<>(insertData);
        Node<E> searchNode = search(searchData);
        if(searchData != null){
            searchNode.setNext(newNode);
            newNode.setNext(tail);
            return true;
        }
        return false;
    }
    public void popFirst(){
        if(head == null)
            System.out.println("Linked list is empty");
        else
            head = head.getNext();
    }
    public void popLast(){
        Node<E> temp = head;
        E popData = tail.getKey();
        if(head == null) {
            System.out.println("Linked list is empty");
            return;
        }else {
            while (temp.getNext() != tail) {
                temp = temp.getNext();
            }
        }
            temp.setNext(null);
            temp = tail;
    }
    void deleteNode(int index){
        Node<E> temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.getNext();
            temp.next = temp.next.next;
        }
    }
    public int countNodes() {
        int count = 0;
        //Node current will point to head
        Node current = head;

        while(current != null) {
            //Increment the count by 1 for each node
            count++;
            current = current.next;
        }
        return count;
    }
    public void print(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.getKey() +" ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
