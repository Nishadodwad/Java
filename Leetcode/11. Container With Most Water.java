class Solution {
    public int maxArea(int[] height) {
        int area=Integer.MIN_VALUE, i=0, j=height.length-1;
        while(i<j)
        {
            int minH = Math.min(height[i],height[j]);
            int temparea = minH*(j-i);
            if(area<temparea)
            {
                area=temparea;
            }
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return area;
    }
}
