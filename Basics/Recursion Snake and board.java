import java.io.*;
import java.util.*;

public class Solution {

    public static void sb(int cpos, int n, int m, String ans,ArrayList<String> paths)
    {
        if(cpos>n)
        {
            return;
        }
        if(cpos==n)
        {
            paths.add(ans);
            return;
        }
        for(int i=1;i<=m;i++)
        {
            sb(cpos+i,n,m,ans+i,paths);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        ArrayList<String> paths = new ArrayList<>();
        sb(0,n,m,"",paths);
        System.out.println(paths.size());
        System.out.println(paths);
        for(int i=0;i<paths.size();i++)
        {
            System.out.println(paths.get(i));
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
