import java.io.*;
import java.util.*;

public class Solution {

    public static int power(int x,int n)
    {
        if(n==0)
            return 1;
        int subans=power(x,n/2);
        int ans=subans*subans;
        if(n%2!=0)
        {
            ans=ans*x;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        System.out.println(power(x,n));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
