import java.io.*;
import java.util.*;

public class Solution {

    public static void SelectionSort(int a[], int n)
    {
        for(int i=0;i<n;i++)
        {
            int minIdx=i;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]<a[minIdx])
                {
                    minIdx=j;
                }
            }
            int temp=a[i];
            a[i]=a[minIdx];
            a[minIdx]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
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
       SelectionSort(a,n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
