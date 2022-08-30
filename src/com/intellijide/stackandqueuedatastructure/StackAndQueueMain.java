package com.intellijide.stackandqueuedatastructure;

public class StackAndQueueMain {
    public static void main(String[] args) {
        StackAndQueue<Integer> stackList1 = new StackAndQueue<>();

        stackList1.push(70);
        stackList1.push(30);
        stackList1.push(56);
        stackList1.print();
    }
}
