import java.io.*;
import java.util.*;

public class Solution {
    
    public static void sort01(int a[], int n)
    {
        int i=0, j=0;
        while(i<n)
        {
            if(a[i]==0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=scn.nextInt();
        }
        sort01(a,n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
