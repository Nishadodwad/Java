class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
        {
            return true;
        }
        int n=s.length();
        int i=0, j=n-1;
        while(i<j)
        {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            if(!Character.isLetterOrDigit(c1))
            {
                i++;
            }
            else if(!Character.isLetterOrDigit(c2))
            {
                j--;
            }
            else
            {
                if(!(Character.toLowerCase(c1)==Character.toLowerCase(c2)))
                {
                    return false;
                }
                i++;
                j--;
            }

        }
        return true;
    }
}
