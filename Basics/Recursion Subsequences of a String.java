import java.io.*;
import java.util.*;

public class Solution {

    public static List<String> subsequence(String s)
    {
        if(s.length()==0)
        {
            List<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = s.charAt(0);
        String ros = s.substring(1);
        List<String> subans = subsequence(ros);
        List<String> ans = new ArrayList<>();
        //Not part of answer
        for(int i=0;i<subans.size();i++)
        {
            ans.add(subans.get(i));
        }
        //part of answer
        for(int i=0;i<subans.size();i++)
        {
            ans.add(ch + subans.get(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        System.out.println(subsequence(s));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
