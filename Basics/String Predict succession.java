import java.io.*;
import java.util.*;

public class Solution {

    public static String [] predict(String a[],String s1,String s2)
    {
        ArrayList <String> ans = new ArrayList<>();
        int idx=0;
        for(int i=0;i<a.length-2;i++)
        {
            if(a[i].equals(s1) && a[i+1].equals(s2))
            {
                ans.add(a[i+2]);
            }
        }
        String [] arr  = ans.toArray(new String[0]);
        return arr;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String a[]=s.split(" ",0);
        String s1 = scn.next();
        String s2 = scn.next();
        String arr[] = predict(a,s1,s2);
        for(String str : arr)
        {
            System.out.println(str);
        }
        /*for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
