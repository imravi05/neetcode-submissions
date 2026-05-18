class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean result = false;
        for(int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                result = true;
                break;
            }
            else{
                result = false;
            }
        }
        return result;
        
    }
}