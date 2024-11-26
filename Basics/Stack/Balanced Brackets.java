import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isBalanced(String str)
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='('||ch=='['||ch=='{')
            {
                s.push(ch);
            }
            else if(ch==')'||ch==']'||ch=='}')
            {
                if(s.size()==0)
                    return false;
                if(ch==')'&&s.peek()=='(')
                    s.pop();
                else if(ch=='}'&&s.peek()=='{')
                    s.pop();
                else if(ch==']'&&s.peek()=='[')
                    s.pop();
                else
                    return false;
            }
        }
        if(s.size()==0)
            return true;
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(isBalanced(str));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
