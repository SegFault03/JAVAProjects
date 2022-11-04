package JAVAAssignments.Assignments.Assignment5;
public class Q1{
    public static void main(String[] args) {
        LinkedList start = new LinkedList(new LinkedList.Node<Integer>(1));
        start.insertAtEnd(new LinkedList.Node<Integer>(2));
        start.insertAtEnd(new LinkedList.Node<Integer>(3));
        start.insertAtEnd(new LinkedList.Node<Integer>(4));
        start.displayLinkedList();
    }
}
