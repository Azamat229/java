import java.util.Scanner;
// This Queue was implemented with Array
public class Queue {
    private static int n = 5;


    private static int queue[] = new int[n];

    private static int front = -1;
    private static int rear = -1;

    static void enqueue(int x) { // add
        if (rear == n - 1) {
            System.out.println("overflow"); // array is overflow
        } else if (front == -1 && rear == -1) { // array is empty
            front = rear = 0;
            queue[rear] = x;
        } else {
            rear++;
            queue[rear] = x; // add the new item to array
        }
    }

    static void dequeue() { //delete
        if (front == -1 && rear == -1) { // array is empty
            System.out.println("empty array");
        } else if (front == rear) { // in array 1 item
            front = rear = -1;

        } else {
            System.out.println(queue[front]+" was delete from Queue"); // delete the item and move next
            front++;
        }

    }

    static void display() {
        if (front == -1 && rear == -1) {
            System.out.println("array is empty");
        } else {
            for (int i = front; i < rear + 1; i++) {
                System.out.print(queue[i]+"|");
            }
            System.out.println();
        }
    }

    static void peek() {
        if (front == -1 && rear == -1) {
            System.out.println("queue is empty");
        } else {
            System.out.println(queue[front]);
        }
    }

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int ch;
        System.out.println("Note: In Queue - deleting item from head and add item to end of queue");
        System.out.println("Example: DELETE <- 1|2|3|4|5 <- ADD");
        do {
            System.out.println("Enter choose: 1:Enqueue  2:Dequeue  3:Peek  4:Display");
            ch = myObj.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter the value");
                    int x = myObj.nextInt();
                    enqueue(x);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    display();
                    break;
                default:
                    System.out.println("invalid chose");
            }
        }
        while (ch != 0);

    }
}
