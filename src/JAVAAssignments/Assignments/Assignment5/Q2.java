package JAVAAssignments.Assignments.Assignment5;

public class Q2 {
    public static void main(String[] args) {
        LinkedList start = new LinkedList(new LinkedList.Node<Integer>(2));
        start.insertAtBeginning((new LinkedList.Node<Integer>(1)));
        start.insertAtEnd(new LinkedList.Node<Integer>(5));
        start.insertBeforeNode(3,(new LinkedList.Node<Integer>(3)));
        start.insertAfterNode(3,new LinkedList.Node<Integer>(4));
        start.displayLinkedList();
    }
}
