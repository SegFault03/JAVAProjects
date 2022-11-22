package JAVAAssignments.JAVALabQuestions;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q8 {
    public static void main(String[] args) {
        int[] a=null;
        try
        {
            System.out.println(a[0]);
        }
        catch (Exception e)
        {
            System.out.println(e);
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
                    Set<String> myStr = new HashSet<String>();
                    myStr.add("obj1");
                    Iterator itr = myStr.iterator();
                    Method mtd = itr.getClass().getMethod("hasNext");
                    System.out.println(mtd.invoke(itr));
                }
                catch (Exception e)
                {
                    System.out.println(e);
                }
            }
        }
    }
}
