package JAVAAssignments.Assignments.Assignment2;

public class Q3
{
    public static void main(String[] args) {
        int i;
        int j;
        System.out.println("(i)");
        for (i=1; i<=4; i++) {
            for (j = 1; j <= 10; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("\n(ii)");
        for (i=1; i<=5; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("\n(iii)");
        for (i=1; i<=5; i++) {
            for (j = 5-i; j >= 1; j--)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("\n(iv)");
        for (i=1; i<=5; i++) {
            for (j = 10-2*i; j >= 1; j--)
                System.out.print(" ");
            for (j = 1; j <= 2*i-1; j++)
                System.out.print("* ");
            System.out.println();
        }
        System.out.println("\n(v)");
        for (i=1; i<=5; i++) {
            for (j = 10-2*i; j >= 1; j--)
                System.out.print(" ");
            for (j = 1; j <= 2*i-1; j++)
                System.out.print(i+" ");
            System.out.println();
        }
        System.out.println("\n(vi)");
        for (i=1; i<=5; i++) {
            for (j = 10-2*i; j >= 1; j--)
                System.out.print(" ");
            for (j = i; j >= 1; j--)
                System.out.print(j+" ");
            for (j = 2; j <= i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}
