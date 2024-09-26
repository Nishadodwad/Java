import java.io.*;
import java.util.*;

public class Solution {


    
    public static void targetsumpair(int a[],int n,int target)
    {
        int left=0, right=n-1;
        int sum=0;
        while(left<right)
        {
            sum = a[left]+a[right];
            if(sum<target)
            {
                left++;
            }
            if(sum>target)
            {
                right--;
            }
            if(sum==target)
            {
                System.out.println(a[left]+" "+a[right]);
                left++;
                right--;
            }
        }
    }
    public static void sort(int a[],int n)
    {
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
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
        int t = scn.nextInt();
        sort(a,n);
        targetsumpair(a,n,t);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
