import java.util.Scanner;

// This Stack was implemented with Array

public class Stack {
    public static int n = 5;
    public static int stack[] = new int[n];
    public static int top = -1;

    public static void push(int x) {
        if (top == n - 1) {
            System.out.println("overflow");
        } else {
            top++;
            stack[top] = x;
        }
    }

    public static void pop() {
        int item;
        if (top == -1) {
            System.out.println("under law");
        } else {
            item = stack[top];
            top--;
            System.out.println("|" + item + "|");
        }
    }

    public static void peek() {
        if (top == -1) {
            System.out.print("empty");

        } else {
            System.out.println("|" + stack[top] + "|");
        }
    }

    public static void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println("|" + stack[i] + "|");
        }
    }


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int ch;
        System.out.println("Note: In Stack - inserting and Deleting happen on same end");
        System.out.println("Example: DELETE and ADD <=> 5|4|3|2|1, 5 = top of stack");
        do {
            System.out.println("Enter choose: 1:Push  2:Pop  3:Peek  4:Display");
            ch = myObj.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the value");
                    int x = myObj.nextInt();
                    push(x);
                }
                case 2 -> pop();
                case 3 -> peek();
                case 4 -> display();
                default -> System.out.println("invalid chose");
            }
        }
        while (ch != 0);
    }
}
