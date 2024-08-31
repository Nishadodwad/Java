import java.io.*;
import java.util.*;

public class Solution {

    public static void encoding (String s, String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
            char ch1 = s.charAt(0);
            
            if(ch1=='0')
            {
                return;
            }
        int num1 = ch1-'0';
        String ros1 = s.substring(1);
        char decoding1 = (char)(num1-1+'a');
        encoding(ros1,ans+decoding1);
        if(s.length()>=2)
        {
            int num2 = Integer.parseInt(s.substring(0,2));
            if(num2<=26)
            {
                char decoding2 = (char)(num2-1+'a');
                String ros2 = s.substring(2);
                encoding(ros2,ans+decoding2);
            }
        }
       
        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        encoding(s,"");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
