package JAVAAssignments.Assignments.Assignment5;

public class LinkedList<T extends Number>{
    Node head;
    int number_of_nodes;
    public LinkedList(Node n)
    {
        head = n;
        number_of_nodes = 1;
    }

    public void insertAtBeginning(Node n)
    {
        n.next = head;
        head = n;
        number_of_nodes++;
    }

    public void insertBeforeNode(int pos, Node n)
    {
        int c=1;
        Node temp = head;
        while(c!=pos-1 && temp!=null)
        {
            temp = temp.next;
            c++;
        }
        if(temp==null) {
            System.out.println("Illegal position");
            return;
        }
        n.next = temp.next;
        temp.next=n;
        number_of_nodes++;
    }

    public void insertAfterNode(int pos, Node n)
    {
        int c=1;
        Node temp = head;
        while(c!=pos && temp!=null)
        {
            temp = temp.next;
            c++;
        }
        if(temp==null) {
            System.out.println("Illegal position");
            return;
        }
        n.next = temp.next;
        temp.next=n;
        number_of_nodes++;
    }

    public void insertAtEnd(Node n) {
        Node temp = head;
        while(temp.next!=null)
            temp = temp.next;
        temp.next = n;
        number_of_nodes++;
    }

    public void deleteFirstNode()
    {
        Node temp = head;
        head = head.next;
        number_of_nodes--;
    }

    public void deleteLastNode()
    {
        Node temp = head;
        while(temp.next.next!=null)
            temp = temp.next;
        temp.next=null;
        number_of_nodes--;
    }

    public void deleteNodeByData(T a )
    {
        Node temp = head;
        if(head.data.equals(a))
        {
            head = head.next;
            number_of_nodes--;
            return;
        }
        while(temp.next!=null) {
            if(temp.next.data.equals(a))
                break;
            temp = temp.next;
        }
        if(temp.next!=null) {
            temp.next = temp.next.next;
            number_of_nodes--;
        }
    }

    public void deleteNodeByPosition(int pos)
    {
        int c=1;
        if(pos==1)
        {
            head = head.next;
            number_of_nodes--;
            return;
        }
        Node temp = head;
        while(c!=pos-1 && temp!=null)
        {
            temp = temp.next;
            c++;
        }
        if(temp.next!=null) {
            temp.next = temp.next.next;
            number_of_nodes--;
        }
    }

    public void displayLinkedList() {
        LinkedList.Node temp = head;
        System.out.println("The Linked List:");
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

     public static class Node<T extends Number>{
        T data;
        Node next;
        public Node(T d)
        {
            data = d;
            next = null;
        }
        Node(T d, Node n)
        {
            data = d;
            next = n;
        }
    }
}
