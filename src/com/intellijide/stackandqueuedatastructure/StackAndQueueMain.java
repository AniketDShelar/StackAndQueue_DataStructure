package com.intellijide.stackandqueuedatastructure;

public class StackAndQueueMain {
    public static void main(String[] args) {
        StackAndQueue<Integer> stackList1 = new StackAndQueue<>();
        StackAndQueue<Integer> stackList2 = new StackAndQueue<>();

        stackList1.push(70);
        stackList1.push(30);
        stackList1.push(56);
        stackList1.printStack();

        stackList1.peek();
        stackList1.pop();
        stackList1.printStack();

        stackList2.queue(56);
        stackList2.queue(30);
        stackList2.queue(70);
        stackList2.printQueue();


    }
}
