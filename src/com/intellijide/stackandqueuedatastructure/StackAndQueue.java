package com.intellijide.stackandqueuedatastructure;

public class StackAndQueue<E> {
    Node<E> head;
    Node<E> tail;
    Node<E> top;


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
    public void peek(){
        System.out.println("Top most element -> " +head.getKey());
    }
    public void pop(){
        if(head == null){
            System.out.println("Stack is Empty");
        }else{
            while(head != null) {
                head = head.getNext();
            }
            System.out.println("Now Stack is Empty completely");
        }
    }
    public void queue(E key){
        Node<E> newNode = new Node<>(key);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    public void dequeue(){
        if(head == null)
            System.out.println("Linked list is empty");
        else
            head = head.getNext();
    }
    public void printStack(){
        Node<E> temp = head;
        while(temp != null){
            System.out.println(temp.getKey() +" ");
            temp = temp.getNext();
        }
        System.out.println();
    }
    public void printQueue(){
        Node<E> temp = head;
        while(temp != null){
            System.out.print(temp.getKey() +" ");
            temp = temp.getNext();
        }
        System.out.println();
    }
}
