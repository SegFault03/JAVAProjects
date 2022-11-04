package JAVAAssignments.Assignments.Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Integer> start = new LinkedList<>(new LinkedList.Node<Integer>(1));
        start.insertAtEnd(new LinkedList.Node<Integer>(2));
        start.insertAtEnd(new LinkedList.Node<Integer>(3));
        start.insertAtEnd(new LinkedList.Node<Integer>(4));
        start.insertAtEnd(new LinkedList.Node<Integer>(5));
        start.insertAtEnd(new LinkedList.Node<Integer>(6));
        System.out.println("Printing the even/odd data: ");
        LinkedList.Node<Integer> temp = start.head;
        List<Integer>odd = new ArrayList<>();
        List<Integer>even = new ArrayList<>();
        while(temp.next!=null)
        {
            if((temp.data)%2==0)
                even.add(temp.data);
            else
                odd.add(temp.data);
            temp = temp.next;
        }
        System.out.println("Odd data: "+odd);
        System.out.println("Even data: "+even);
    }
}
