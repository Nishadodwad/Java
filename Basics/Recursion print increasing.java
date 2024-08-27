import java.io.*;
import java.util.*;

public class Solution {

    public static void print_increasing(int n)
    {
        if(n==0)
        {
            return;
        }
        
        print_increasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        
        print_increasing(n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
