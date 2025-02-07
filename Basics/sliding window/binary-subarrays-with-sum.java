import java.io.*;
import java.util.*;

public class Solution {

    public static int countsa(int n,int arr[],int goal)
    {
        int count[]=new int[n+1];
        int ans=0,psum=0;
        count[0]=1;
        for(int i=0;i<n;i++)
        {
            psum+=arr[i];
            if(psum>=goal)
            {
                ans+=count[psum-goal];
            }
            count[psum]++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int goal=scn.nextInt();
        System.out.println(countsa(n,arr,goal));
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
