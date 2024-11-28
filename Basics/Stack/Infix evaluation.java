import java.io.*;
import java.util.*;

public class Solution {

    public static int precedence(char ch)
    {
        if(ch=='+'||ch=='-')
            return 1;
        else if(ch=='*'||ch=='/')
            return 2;
        else
            return 0;
    }
    public static int operation(int op1, int op2, char opr)
    {
        if(opr=='+')
            return op1+op2;
        else if(opr=='-')
            return op1-op2;
        else if(opr=='*')
            return op1*op2;
        else if(opr=='/')
            return op1/op2;
        else
            return 0;
    }
    public static int infix_eval(String str)
    {
        int op2,op1;
        char op;
        int n=str.length();
        Stack<Integer> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
           
            if(ch=='(')
            {
                st2.push(ch);
            }
            else if(ch==')')
            {
                while(st2.peek()!='(')
                {
                    op2=st1.pop();
                    op1=st1.pop();
                    op=st2.pop();
                    int ans=operation(op1,op2,op);  
                    st1.push(ans);   
                }
                st2.pop();
            }
            else if(ch=='+'||ch=='-'||ch=='*'||ch=='/')
            {
                while(st2.size()>0&&precedence(st2.peek())>=precedence(ch))
                {
                        op2=st1.pop();
                        op1=st1.pop();
                        op=st2.pop();
                        int ans=operation(op1,op2,op); 
                        st1.push(ans);
                }
               
              st2.push(ch);
              
            }
            else if(ch>='0'&&ch<='9')
            {
                st1.push(ch-'0');
            }
            
           
        }
        while(st2.size()>0&&st1.size()>1)
            {
                    op2=st1.pop();
                    op1=st1.pop();
                    op=st2.pop();
                    int ans=operation(op1,op2,op);  
                    st1.push(ans);
            }
         return st1.pop();
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int ans = infix_eval(str);
        System.out.println(ans);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
