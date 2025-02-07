import java.io.*;
import java.util.*;

public class Solution {
    public static void sort01(int n, int arr[])
    {
        int i=0,j=0;
        while(i<n)
        {
            if(arr[i]==0)
                i++;
            else
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]  =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        sort01(n,arr);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
