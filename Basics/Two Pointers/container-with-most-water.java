import java.io.*;
import java.util.*;

public class Solution {

    public static int maxArea(int n, int arr[])
    {
        int area=Integer.MIN_VALUE, i=0, j=n-1;
        
        while(i<j)
        {
            int minHeight=Math.min(arr[i],arr[j]);
            int temparea=minHeight*(j-i);
            if(arr[i]<arr[j])
                i++;
            else
                j--;
            if(area<temparea)
                area=temparea;
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println(maxArea(n,arr));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
