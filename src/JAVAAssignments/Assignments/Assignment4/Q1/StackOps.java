package JAVAAssignments.Assignments.Assignment4.Q1;
import java.util.*;
public class StackOps extends AbstractStack{
    Stack<Integer> stack;
    StackOps()
    {
        stack = new Stack<>();
    }

    @Override
    public int peek() {
        return stack.peek();
    }

    @Override
    public void push(int n) {
        stack.push(n);
    }

    @Override
    public int pop() {
        return stack.pop();
    }

    @Override
    public void printStack() {
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("\nSTACK: ");
        stack.forEach(item->System.out.print(item+" "));
    }

    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in);
        StackOps stackOps = new StackOps();
        System.out.println("\nEnter 1 to push, 2 to pop, 3 to peek, 0 to exit");
        ch = sc.nextInt();
        do {
            switch (ch)
            {
                case 0:
                    return;
                case 1:
                    System.out.println("Enter element to push: ");
                    int temp = sc.nextInt();
                    stackOps.push(temp);
                    stackOps.printStack();
                    break;

                case 2:
                    System.out.println("Item popped is: "+stackOps.pop());
                    stackOps.printStack();
                    break;

                case 3:
                    System.out.println("Item at top of the stack is: "+stackOps.peek());
                    break;
            }
            System.out.println("\nEnter 1 to push, 2 to pop, 3 to peek, 0 to exit");
            ch = sc.nextInt();
        }while (true);
    }
}
