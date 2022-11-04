package JAVAAssignments.Assignments.Assignment4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q5 {
    Comparator<Character> comparatorAscending = new Comparator<Character>() {
        @Override
        public int compare(Character o1, Character o2) {
            return o1-o2;
        }
    };

    Comparator<Character> comparatorDescending = new Comparator<Character>() {
        @Override
        public int compare(Character o1, Character o2) {
            return o2-o1;
        }
    };

    public void reorder(int[] a, String order)
    {
        for (int i = 0; i < a.length; i++) {
            Integer temp[] = new Integer[String.valueOf(a[i]).length()];
            int c=0;
            while(a[i]>0)
            {
                temp[c] = a[i]%10;
                a[i]/=10;
                c++;
            }
            if(order.equals("desc"))
                Arrays.sort(temp,Collections.reverseOrder());
            else
                Arrays.sort(temp);
            StringBuilder s= new StringBuilder();
            for (Integer integer : temp) {
                s.append(String.valueOf(integer));
            }
            a[i] = Integer.parseInt(String.valueOf(s));
        }
        for (int j : a) {
            System.out.println(j + " ");
        }
    }

    public static void main(String[] args) {
        int n;
        String query;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < a.length; i++) {
            a[i] =sc.nextInt();
        }
        System.out.println("Enter query: ");
        query =sc.next();
        Q5 ob = new Q5();
        ob.reorder(a,query);
    }
}
