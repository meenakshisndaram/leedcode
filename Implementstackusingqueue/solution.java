package Implementstackusingqueue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> que;

    public MyStack() {
        que = new LinkedList<>();
    }


    public void push(int x) {

        que.add(x);


        int size = que.size();
        for (int i = 1; i < size; i++) {
            que.add(que.remove());
        }
    }

    // Removes the element on top of the stack and returns it
    public int pop() {
        if (!que.isEmpty()) {
            return que.remove();
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Get the top element
    public int top() {
        if (!que.isEmpty()) {
            return que.peek();
        }
        throw new IllegalStateException("Stack is empty");
    }

    // Return whether the stack is empty
    public boolean empty() {
        return que.isEmpty();
    }

    public static void main(String... args) {
        MyStack ms = new MyStack();

        // Push elements onto the stack
        for (int i = 1; i < 8; i++) {
            ms.push(i);
            System.out.println("Pushed: " + i);
        }

        // Print top element
        System.out.println("Top element: " + ms.top());

        // Pop elements from the stack
        while (!ms.empty()) {
            System.out.println("Popped: " + ms.pop());
        }

        // Check if stack is empty
        System.out.println("Is stack empty? " + ms.empty());
    }
}
