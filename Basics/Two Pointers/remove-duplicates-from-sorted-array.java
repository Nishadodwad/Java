import java.io.*;
import java.util.*;

public class Solution {

    public static int remove(int n, int arr[])
    {
        int i=1,c=1,j=0;
        while(i<n)
        {
            if(arr[i]!=arr[j])
            {
                c++;
                j=i;
            }
            i++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int count=remove(n,arr);
        System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
