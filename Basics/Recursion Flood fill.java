import java.io.*;
import java.util.*;

public class Solution {

    public static void floodfill(int sr, int sc, int dr, int dc, int a[][], String ans, boolean visited[][])
    {
        if(sr<0||sc<0||sr>dr||sc>dc||a[sr][sc]==1||visited[sr][sc]==true)
        {
            return;
        }
        if(sr==dr&&sc==dc)
        {
            System.out.println(ans);
            return;
        }
        visited[sr][sc]=true;
        floodfill(sr-1,sc,dr,dc,a,ans+"t",visited);
        floodfill(sr,sc-1,dr,dc,a,ans+"l",visited);
        floodfill(sr+1,sc,dr,dc,a,ans+"d",visited);
        floodfill(sr,sc+1,dr,dc,a,ans+"r",visited);
        visited[sr][sc]=false;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int a[][] = new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=scn.nextInt();
            }
        }
        int dr = n-1;
        int dc = m-1;
        boolean visited[][] = new boolean[n][m];
        floodfill(0,0,dr,dc,a,"",visited);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
