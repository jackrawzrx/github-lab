class stack {
    int maxSize;
    int[] arr;
    int top;

    MyStack(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    boolean isFull() {
        return top == maxSize - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[++top] = x;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
}

public class Main {
    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(5);
        s.push(10);
        s.push(15);
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
