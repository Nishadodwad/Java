import java.io.*;
import java.util.*;

public class Solution {
    
    public static void sort01(int a[], int n)
    {
        int i=0, j=0, k=n-1;
        while(i<=k)
        {
            if(a[i]==0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j++;
            }
            else if(a[i]==1)
            {
                
                i++;
              
            }
            else 
            {
                int temp=a[k];
                a[k]=a[i];
                a[i]=temp;
                k--;
            }
        }
        for(int l=0;l<n;l++)
        {
            System.out.print(a[l]+" ");
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
