import java.io.*;
import java.util.*;

public class Solution {

    public static void print(String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            String ros = (s.substring(0,i)+s.substring(i+1));
            print(ros,ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        print(s,"");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
