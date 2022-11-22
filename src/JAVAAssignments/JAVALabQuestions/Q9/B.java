package JAVAAssignments.JAVALabQuestions.Q9;

import java.util.Arrays;

public class B {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7};
        for(int i=0;i<a.length/2;i++)
        {
            int temp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
