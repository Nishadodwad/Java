import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int tar=scn.nextInt();
        int r[]=new int[2];
        r=sumtar(arr,n,tar);
        System.out.println(r[0]+" "+r[1]);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    public static int[] sumtar(int arr[], int n, int tar)
    {
        int i=0,j=n-1;
        int r[]=new int[2];
        while(i<j)
        {
            if(arr[i]+arr[j]<tar)
            {
               i++;
            }
            else if(arr[i]+arr[j]==tar)
            {
                r[0]=i+1;
                r[1]=j+1;
                return r;
            }
            else
            {
                j--;
            }
           
        }
        System.out.println("Not found");
        return r;
    }
}
