class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1, j=0,c=1;
        int n = nums.length;
        while(i<n)
        {
            if(nums[i]!=nums[j])
            {
               
                nums[j+1]=nums[i];
                j=j+1;
                c++;
            }
            i++;
        }
        return c;
    }
}
