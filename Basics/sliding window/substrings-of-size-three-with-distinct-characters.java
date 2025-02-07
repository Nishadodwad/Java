import java.io.*;
import java.util.*;

public class Solution {

    public static int goodsubcount(String str)
    {
        int count=0,i=0,j=0;
        while(i<str.length()-2)
        {
            if(str.charAt(i)==str.charAt(i+1)||str.charAt(i)==str.charAt(i+2)||str.charAt(i+1)==str.charAt(i+2))
            {
                i++;
            }
            else
            {
                count++;
                i++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.next();
        System.out.println(goodsubcount(str));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
