import java.io.*;
import java.util.*;

public class Solution {

    public static int[] next_greater_left(int []arr,int n)
    {
        int ans []=new int[n];
        ans[0]=-1;
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<n;i++)
        {
            while(st.size()>0&&st.peek()<arr[i])
            {
                st.pop();
            }
            if(st.size()==0)
                ans[i]=-1;
            else
                ans[i]=st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr []=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scn.nextInt();
        }
        int ans[] = next_greater_left(arr,n);
        for(int i=0;i<n;i++)
        {
            System.out.println(ans[i]);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
