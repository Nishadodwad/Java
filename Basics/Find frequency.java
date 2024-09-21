import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d=scn.nextInt();
        int a=scn.nextInt();
        int n=d;
        int c=0;
        while(n!=0)
        {
            int rem=n%10;
            n=n/10;
            if(rem==a)
            {
                c++;
            }
        }
        System.out.println(c);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
