import java.io.*;
import java.util.*;

public class Solution {

    public static void printkpc(String s, String [] a,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        int index=s.charAt(0)-'0';
        String ros=s.substring(1);
        String str=a[index];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            printkpc(ros,a,ans+ch);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        String a[] = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
        printkpc(s,a,"");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
