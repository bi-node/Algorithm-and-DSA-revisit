package lesson2.DataStructure;

import javax.swing.*;
import javax.swing.text.html.Option;
import java.util.Optional;

public class Queue<T> {
    Node<T> head, tail;

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = head;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
    }

    public T dequeue() {
        if (head == null) {
            System.out.println("Empty Queue");
            return null;
        }
        T temp = head.data;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        return temp;
    }

    public void print() {
        if (head == null) return;
        for (Node<T> node = head; node != null; node = node.next) {
            System.out.println(node.data);
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }


}
