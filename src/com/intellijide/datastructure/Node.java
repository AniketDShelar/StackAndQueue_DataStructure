package com.intellijide.datastructure;

public class Node<K> {
    K key;
    Node<K> next;
    public Node(K key) {
        this.key = key;
    }
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public Node<K> getNext() {
        return next;
    }

    public void setNext(Node<K> next) {
        this.next = next;
    }
}
