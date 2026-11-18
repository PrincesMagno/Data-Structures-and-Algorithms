// Name: Princes Nicole Magno
// Subject: Data Structures and Algorithms
// Activity: Stack Implementation using Array

public class DSA_Activity_Stack {
    int top;
    int max = 5;
    int[] stack = new int[max];

    DSA_Activity_Stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == max - 1;
    }

    void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
        } else {
            top++;
            stack[top] = value;
            System.out.println("Pushed: " + value);
        }
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int value = stack[top];
            top--;
            System.out.println("Popped: " + value);
            return value;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[top];
        }
    }

    void display() {
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DSA_Activity_Stack s = new DSA_Activity_Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Top element: " + s.peek());
        s.pop();
        s.display();
    }
}
