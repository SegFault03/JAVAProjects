package JAVAAssignments.Assignments.Assignment4.Q3;

import java.util.*;
public class QueueOps extends AbstractQueue{
    List<Integer> queue;
    QueueOps()
    {
        queue = new ArrayList<>();
    }
    @Override
    public int peek() {
        return queue.get(0);
    }

    @Override
    public void enqueue(int n) {
        queue.add(n);
    }

    @Override
    public int dequeue() {
        return queue.remove(0);
    }

    @Override
    public void printQueue() {
        if(queue.isEmpty())
        {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue: ");
        queue.forEach(item->System.out.print(item+" "));
    }

    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        QueueOps queueOps = new QueueOps();
        System.out.println("\nEnter 1 to enqueue, 2 to dequeue, 3 to peek, 0 to exit");
        ch = sc.nextInt();
        do {
            switch (ch)
            {
                case 0:
                    return;
                case 1:
                    System.out.println("Enter element to enqueue: ");
                    int temp = sc.nextInt();
                    queueOps.enqueue(temp);
                    queueOps.printQueue();
                    break;

                case 2:
                    System.out.println("Item popped is: "+queueOps.dequeue());
                    queueOps.printQueue();
                    break;

                case 3:
                    System.out.println("Item at top of the queue is: "+queueOps.peek());
                    break;
            }
            System.out.println("\nEnter 1 to enqueue, 2 to dequeue, 3 to peek, 0 to exit");
            ch = sc.nextInt();
        }while (true);
    }
}
