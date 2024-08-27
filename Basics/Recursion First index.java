import java.io.*;
import java.util.*;

public class Solution {

    public static void first_index(int a[],int l,int n,int k)
    {
        if(l==n)
        {
            System.out.println(-1);
            return;
        }
        if(a[l]==k)
        {
            System.out.println(l);
            return;
        }
        first_index(a,l+1,n,k);
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
        int l=0;
        first_index(a,l,n,k);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
