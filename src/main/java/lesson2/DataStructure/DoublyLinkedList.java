package lesson2.DataStructure;

import java.util.List;

public class DoublyLinkedList<T> {
    Node<T> head;
    int size
            ;

    DoublyLinkedList() {
        head = null;
        size=0;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            head.next = null;
        } else {
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.previous = temp;

        }
       size++;
    }

    public void insert(T data, int pos){
        if(pos>size) System.out.println("Invalid Position");
        if(pos==size-1) {add(data); return;}
        Node<T> temp=head;
        for(int i=0; i<pos; i++)
        {
            temp=temp.next;
        }
        Node<T> newNode=new Node<>(data);

        newNode.next=temp.next;
        temp.next=newNode;
        newNode.previous=temp;
        newNode.next.previous=newNode;
        size++;


    }


    public void removeAtLast()
    {
        if(isEmpty()) {
            System.out.println("Empty Doubly Linked List! Can't remove item");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node<T> temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }

        temp.next=null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("null");
            return;
        }
        System.out.print("\nhead<=>");
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<=>");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    public boolean isEmpty() {
        return head == null;
    }


    public static void main(String[] args) {
        DoublyLinkedList<String> dll = new DoublyLinkedList<>();
        dll.add("Apple");
        dll.add("Banana");
        dll.add("Guava");
        dll.print();
        System.out.println(dll.size);
        dll.removeAtLast();
        //dll.removeAtLast();
        dll.print();
        dll.insert("Pineapple", 2);
        dll.print();


    }
}
