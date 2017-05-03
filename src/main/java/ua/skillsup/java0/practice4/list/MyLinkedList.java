package ua.skillsup.java0.practice4.list;

import java.util.Iterator;

/**
 * @author Anton Chernetskij
 *         <p/>
 *         TODO: read about Linked Lists
 */
public class MyLinkedList implements MyCollection {
    private class Node{
        String value;
        Node previous;
        Node next;

        private Node(String value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    /**
     * Appends v to the tail
     *
     * @param v
     */
    @Override
    public void add(String v) {
        Node newNode = new Node(v);
        if (head == null) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    /**
     * Removes first occurrence of v from list
     *
     * @param v
     * @return true if v was removed
     */
    @Override
    public boolean remove(String v) {
        if (head == null) {
            return false;
        }
        Node current = head;
        while (nodeNotMatch(v, current)){
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        if (current == head) {
            head = current.next;
        } else if (current == tail) {
            tail = current.previous;
        } else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        size--;
        return true;
    }

    private boolean nodeNotMatch(String v, Node current) {
        return current.value != null && !current.value.equals(v) || current.value == null ^ v == null;
    }

    /**
     * @return list size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * @param v
     * @return index of v
     */
    @Override
    public int find(String v) {
        Node current = head;
        int i = 0;
        while (nodeNotMatch(v, current)){
            current = current.next;
            i++;
            if (current == null) {
                return -1;
            }
        }
        return i;
    }

    /**
     * @param index
     * @return value with given index
     */
    @Override
    public String get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        int i = 0;
        Node current = head;
        while (i < index){
            current = current.next;
            i++;
        }
        return current.value;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            Node current = head;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public String next() {
                Node result = current;
                current = current.next;
                return result.value;
            }
        };
    }
}
