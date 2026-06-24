class Solution {
    public int maxArea(int[] height) {
        int left = 0,
            right = height.length - 1,
            maxArea = 0;
        while(left < right){
            int currentArea = (right - left) * Math.min(height[left], height[right]); 

            // subtract index and keep the value of index with has minimum value than other 

            maxArea = Math.max(maxArea, currentArea);
            // keep the maximum of max and current
         

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}

// left   right (right-left)  minheight curr    max  (left < right)
// 0        8       8           1          8     8      left++
// 1        8       7           7           7    49     right --