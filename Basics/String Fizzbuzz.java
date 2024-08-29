import java.io.*;
import java.util.*;

public class Solution {

    public static void fizz(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0 && i%5!=0)
            {
                System.out.println("Fizz");
            }
            else if(i%3!=0 && i%5==0)
            {
                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fizz(n);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
