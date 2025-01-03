import java.io.*;
import java.util.*;

public class Solution {

    public static void swap(int nums[],int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void sort012(int nums[], int n)
    {
        int i=0,j=0,k=n-1;
        while(i<=k)
        {
            if(nums[i]==0)
            {
                swap(nums,i,j);
                i++;
                j++;
            }
            else if(nums[i]==1)
            {
                i++;
            }
            else
            {
                swap(nums,i,k);
                k--;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scn.nextInt();
        }
        sort012(nums,n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
