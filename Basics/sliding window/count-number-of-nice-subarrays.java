import java.io.*;
import java.util.*;

public class Solution {

    public static int atmost(int n, int arr[], int k)
    {
        int ans=0,i=0;
        for(int j=0;j<n;j++)
        {
            k-=(arr[j]%2);
            while(k<0)
            {
                k+=arr[i]%2;
                i++;
            }
            ans+=(j-i+1);
        }
        return ans;
    }
    public static int NiceSubarray(int n, int arr[], int k)
    {
        int ans1=atmost(n,arr,k);
        int ans2=atmost(n,arr,k-1);
        return ans1-ans2;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int k=scn.nextInt();
        System.out.println(NiceSubarray(n,arr,k));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
