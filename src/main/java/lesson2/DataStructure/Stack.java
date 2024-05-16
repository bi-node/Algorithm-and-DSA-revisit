package lesson2.DataStructure;

public class Stack<T> {
    Node<T> top;


    public void push(T data)
    {
        Node<T> newNode=new Node<T>(data);
        newNode.next=top;
        top=newNode;

    }

    public void pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }

            top=top.next;

    }

    public T peek()
    {
        if(top==null){
            System.out.println("Stack is empty");
            return null;
        }

        return top.data;
    }

    public static void main(String[] args) {

        // Testing the Stack implementation
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");
        System.out.println(stack.peek()); // Output: Orange
        stack.pop();
        System.out.println(stack.peek()); // Output: Banana
        stack.pop();
        System.out.println(stack.peek()); // Output: Apple
        stack.pop();
        System.out.println(stack.peek()); // Output: Stack is empty, followed by null
        stack.pop(); // Trying to pop from an empty stack
    }
}
