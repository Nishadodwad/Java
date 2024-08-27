import java.io.*;
import java.util.*;

public class Solution {

    public static void first_index(int a[],int l,int n,int k,int f)
    {
        
        if(l==n&&f==0)
        {
            System.out.println(-1);
            return;
        }
        if(l==n)
            return;
        if(a[l]==k)
        {
            System.out.println(l);
            f++;
        }
        first_index(a,l+1,n,k,f);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int l=0,f=0;
        first_index(a,l,n,k,f);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
