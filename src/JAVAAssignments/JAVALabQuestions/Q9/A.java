package JAVAAssignments.JAVALabQuestions.Q9;

public class A {
    public static void main(String[] args) {
        int[] a=null;
        try{
            System.out.println(a[0]);
        }catch (Exception e)
        {
            System.out.println(e);
            a = new int[1];
            try {
                System.out.println(a[1]);
            }
            catch (Exception e2)
            {
                System.out.println(e2);
            }
        }
    }
}
