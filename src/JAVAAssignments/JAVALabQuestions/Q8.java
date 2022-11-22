package JAVAAssignments.JAVALabQuestions;


public class Q8 {
    static class inner{
        private static int a=5;
    }
    public static void main(String[] args) {
        int[] a=null;
        try
        {
            System.out.println(a[0]);
        }
        catch (Exception e)
        {
            System.out.println(e);
            a[0] = 1;
        }
        finally {
            a = new int[2];
            try{
                System.out.println(a[3]);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            finally {
                try{
                    System.out.println(inner.a);
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
