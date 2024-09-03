import java.io.*;
import java.util.*;

public class Solution {

    public static void tss(int a[],int idx, int sof, int tar, String ans)
    {
        if(sof>tar)
        {
            return;
        }
        if(idx==a.length)
        {
            if(tar==sof)
            {
                System.out.println(ans+".");
            }
            return;
        }
        tss(a,idx+1,sof+a[idx],tar,ans+a[idx]+", ");
        tss(a,idx+1,sof,tar,ans);
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        int tar = scn.nextInt();
        
        tss(a,0,0,tar,"");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
