import java.io.*;
import java.util.*;

public class Solution {

    public static List<String> getpaths(int n)
    {
        // negative base case
        if(n<0)
        {
            List<String> base1 = new ArrayList<>();
            return base1;
        }
        // 0 base case
        if(n==0)
        {
            List<String> base2 = new ArrayList<>();
            base2.add("");
            return base2;
        }
        List<String> onestep = getpaths(n-1);
        List<String> twosteps = getpaths(n-2);
        List<String> threesteps = getpaths(n-3);
        List <String> ans = new ArrayList<>();
        
        for(int i=0;i<onestep.size();i++)
        {
            ans.add("1" + onestep.get(i));
        }
         for(int i=0;i<twosteps.size();i++)
        {
            ans.add("2" + twosteps.get(i));
        }
         for(int i=0;i<threesteps.size();i++)
        {
            ans.add("3" + threesteps.get(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(getpaths(n));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
