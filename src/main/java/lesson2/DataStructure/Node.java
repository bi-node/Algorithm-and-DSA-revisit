package lesson2.DataStructure;

public class Node <T>{
    Node<T> next;
    Node<T> previous;
    T data;
    Node(T data){
        this.data=data;
        next=null;
        previous=null;
    }
}
