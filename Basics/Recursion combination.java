import java.io.*;
import java.util.*;

public class Solution {

    public static void combination(int n,int r,int sn,int sr,String ans)
    {
        if(sn==n&&sr!=r)
        {
            return;
        }
         if(sn==n&&sr==r)
        {
             System.out.println(ans);
            return;
        }
        combination(n,r,sn+1,sr+1,ans+"i");
        combination(n,r,sn+1,sr,ans+"-");
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int r = scn.nextInt();
        combination(n,r,0,0,"");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
