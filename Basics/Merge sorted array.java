import java.io.*;
import java.util.*;

public class Solution {

    public static void merge(int a[],int b[],int n,int m)
    {
        int res[] = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n&&j<m)
        {
            if(a[i]>b[j])
            {
                res[k]=b[j];
                j++;
            }
            else
            {
                res[k]=a[i];
                i++;
            }
            k++;
        }
        while(i<n)
        {
            res[k]=a[i];
            k++;
            i++;
        }
        while(j<m)
        {
            res[k]=b[j];
            k++;
            j++;
        }
        for(i=0;i<res.length;i++)
        {
            System.out.println(res[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        
         int m = scn.nextInt();
        int b[] = new int[m];
        for(int i=0;i<m;i++)
        {
            b[i]=scn.nextInt();
        }
        
        merge(a,b,n,m);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
