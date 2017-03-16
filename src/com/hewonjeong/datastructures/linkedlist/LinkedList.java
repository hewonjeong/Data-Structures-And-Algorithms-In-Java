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

    public String toString() {
        if(head == null){
            return "[]";
        }
        Node temp = head;
        String str = "[";
        while(temp.next != null){
            str += temp.data + ", ";
            temp = temp.next;
        }
        str += temp.data;
        return str + "]";
    }

    public Object removeFirst(){
        Node temp = head;
        head = temp.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    public Object remove(int k){
        if(k == 0) return removeFirst();
        Node temp = getNode(k-1);
        Node todoDeleted = temp.next;
        temp.next = temp.next.next;
        Object returnData = todoDeleted.data;
        if(todoDeleted == tail){
            tail = temp;
        }
        todoDeleted = null;
        size--;
        return returnData;
    }


}
