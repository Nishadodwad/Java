class Solution {
    public boolean isHappy(int n) {
        
        int x = n;
        int sum=0;
        while(x!=0)
        {
            int temp=x%10;
            x=x/10;
            sum=sum+temp*temp;
            if(x==0&&sum>9)
            {
                x=sum;
                sum=0;
            }
            if(x==0&&(sum==1||sum==7))
            {
                return true;
            }
        }
        
        return false;

    }
}
