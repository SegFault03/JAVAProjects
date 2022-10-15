package JAVAAssignments.Assignments.Assignment7;

public class Q3 {
    public static int check(String s)
    {
        if(s.length()%2==1)
            return 0;
        int flag = -1;
        int val = 0;
        for(int i=0;i<s.length();i++)
        {
            if(flag == -1)
            {
                if(s.charAt(i)==':')
                    flag = 0;
                else if(s.charAt(i)=='(')
                    flag = 1;
                else
                    flag = 2 ;
            }
            else
            {
                if(flag==0) {
                    if (s.charAt(i) == '(')
                        val += -1;
                    else
                        val += 1;
                }
                else if(flag==1)
                    val += 1;
                else
                    val += -1;
                flag = -1;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        System.out.println(check("(::(:):):)"));
    }
}

