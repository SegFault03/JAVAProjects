package JAVAAssignments.Assignments.Assignment5;

public class Q3 {
    public static void main(String[] args) {
        LinkedList<Integer> start = new LinkedList<>(new LinkedList.Node<Integer>(1));
        start.insertAtEnd(new LinkedList.Node<Integer>(2));
        start.insertAtEnd(new LinkedList.Node<Integer>(3));
        start.insertAtEnd(new LinkedList.Node<Integer>(4));
        start.insertAtEnd(new LinkedList.Node<Integer>(5));
        start.insertAtEnd(new LinkedList.Node<Integer>(6));
        start.displayLinkedList();
        start.deleteFirstNode();
        start.deleteLastNode();
        start.deleteNodeByData(4);
        start.deleteNodeByPosition(2);
        start.displayLinkedList();
    }
}
