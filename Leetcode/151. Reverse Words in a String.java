class Solution {
    public String removeExtraSpace(String s)
    {
        String ans = "";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                if(ans.length()>0 && ans.charAt(ans.length()-1)!=' ')
                {
                    ans+=" ";
                }
            }
            else
            {
                ans+=ch;
            }
        }
        return ans;
    }
    public String reverseWords(String s) {
        String updated = removeExtraSpace(s);
        String arr[] = updated.split(" ");
        String ans = "";
        for(int i=arr.length-1;i>0;i--)
        {
            ans+=(arr[i]+" ");
        }
        ans+=arr[0];
        return ans;
    }
}
