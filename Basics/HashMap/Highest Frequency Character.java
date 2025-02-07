import java.io.*;
import java.util.*;

public class Solution {

    public static char highest_frequency(String str)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(map.containsKey(ch)==true)
            {
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }
            else
                map.put(ch,1);
        }
        
        int maxfreq = Integer.MIN_VALUE;
        char ans = 'a';
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int freq = map.get(ch);
            if(freq>maxfreq)
            {
                maxfreq = freq;
                ans = ch;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.next();
        System.out.println(highest_frequency(str));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
