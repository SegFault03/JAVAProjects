package JAVAAssignments.JAVALabQuestions.Q10;


import java.util.Scanner;

public class LinkedListNode {
    LinkedListNode next;
    int data;
    LinkedListNode(int d)
    {
        data = d;
        next = null;
    }
    LinkedListNode(int d, LinkedListNode n)
    {
        data = d;
        next = n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        int n = sc.nextInt();
        LinkedListNode head = null,temp=null;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter data for node "+(i+1));
            int data = sc.nextInt();
            if(head==null)
            {
                head = new LinkedListNode(data);
                temp = head;
            }
            else
            {
                temp.next = new LinkedListNode(data);
                temp = temp.next;
            }
        }
        System.out.println("Printing the linked list:");
        while(head!=null)
        {
            System.out.println(head.data+" ");
            head = head.next;
        }
    }
}
