package com.hewonjeong.datastructures.linkedlist;

import com.hewonjeong.datastructures.Node;

/**
 * Created by Hewon Jeong on 06/03/2017.
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
        size++;

    }

    public void addLast(Object data) {
        if (size == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            this.tail.next = newNode;
            this.tail = newNode;
            this.size++;
        }
    }

    private Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = head.next;
        }
        return node;
    }

    public void add(Object data, int index) {
        if (index == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node prevNode = getNode(index - 1);
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            size++;
            if (newNode.next == null) {
                this.tail = newNode;
            }
        }
    }
}
