package JAVAAssignments.Assignments.Assignment8;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        String a,b;
        System.out.println("Enter the 2 strings: ");
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        Map<Character,Integer>akeys = new HashMap<>();
        Map<Character,Integer>bkeys = new HashMap<>();
        for(int i=0;i<a.length();i++)
        {
            if(!akeys.containsKey(a.charAt(i)))
                akeys.put(a.charAt(i),1);
            else
                akeys.put(a.charAt(i),akeys.get(a.charAt(i))+1);
        }
        for(int i=0;i<b.length();i++)
        {
            if(!bkeys.containsKey(b.charAt(i)))
                bkeys.put(b.charAt(i),1);
            else
                bkeys.put(b.charAt(i),bkeys.get(b.charAt(i))+1);
        }
        String common="",uniqueToA="",uniqueToB="";
        Iterator<Character> itr = akeys.keySet().iterator();
        while (itr.hasNext())
        {
            char key = itr.next();
            if(bkeys.containsKey(key))
                common+=key;
            else
                uniqueToA+=key;
        }
        Iterator<Character> itr2 = bkeys.keySet().iterator();
        while (itr2.hasNext())
        {
            char key = itr2.next();
            if(!akeys.containsKey(key))
                uniqueToB+=key;
        }
        char[] sorta = common.toCharArray();
        char[] sortb =uniqueToA.toCharArray();
        char[] sortc = uniqueToB.toCharArray();
        Arrays.sort(sorta);
        Arrays.sort(sortb);
        Arrays.sort(sortc);
        String[] ans = {new String(sorta),new String(sortb),new String(sortc)};
        System.out.println(Arrays.toString(ans));
    }
}
