package lesson2.DataStructure;

public class LinkedList<T> {

    class Node<T> {
        Node<T> next;
        T data;

        Node(T data) {
            this.data = data;
        }

    }

    Node<T> head;

    LinkedList() {
        head = null;
    }

    public void add(T data) {
        Node<T> n = new Node<>(data);
        if (isEmpty()) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public void delete(){
        if(isEmpty()) {
            System.out.println("Empty");
            return;
        }
        if(head.next==null)
            head=null;
        else {
            Node<T> temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next=null;
        }

    }

    public void print() {
       if(!isEmpty()) {
           Node<T> temp = head;
           System.out.print("head->");
           while (temp != null) {
               System.out.print(temp.data + "->");
               temp = temp.next;
           }
           System.out.print(null + "\n");
       }
    }


    public boolean isEmpty() {
        return head == null;
    }


    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Binod");
        ll.add("Toyam");
        ll.add("Maya");
        ll.add("Sabina");
        ll.print();
        ll.delete();
        ll.delete();
        ll.delete();
        ll.delete();
        ll.delete();

        ll.print();
    }

}