import java.io.*;
import java.util.*;

public class Solution {

    public static void reverse(char a[],int left,int right)
    {
        while(left<right)
        {
            char temp = a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }
    }
    public static void Sticking(char a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='i')
            {
                reverse(a,0,i-1);
            }
        }
        String ans = "";
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!='i')
            {
                ans+=a[i];
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        char a[] = new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            a[i]=ch;
        }
        Sticking(a);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
