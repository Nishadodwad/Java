import java.io.*;
import java.util.*;

public class Solution {

    public static void count(int n)
    {
        if(n==0)
        {
            
            return;
        }
        System.out.println(n);
        count(n-1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        count(n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
