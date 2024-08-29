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
        char ch = s.charAt(0);
        String ros = s.substring(1);
        print(ros,ans+ch);
        print(ros,ans);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        print(s,"");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
