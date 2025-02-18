class Solution {
    public void reverse(int m, int n, int[] nums)
    {
        while(m<n)
        {
            int temp=nums[m];
            nums[m]=nums[n];
            nums[n]=temp;
            m++;
            n--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        reverse(0,n-1,nums);
        reverse(0,k-1,nums);
        reverse(k,n-1,nums);
    }
}
