class Solution {
    public int maxProduct(int[] nums) {
        int minEnd = nums[0];
        int maxEnd = nums[0];
        int res = nums[0];
        for(int i=1;i<nums.length;i++){
          
            int max =Math.max(nums[i] * minEnd,nums[i] * maxEnd);
            int min =Math.min(nums[i] * minEnd,nums[i] * maxEnd);
            minEnd = Math.min(nums[i],min);
            maxEnd = Math.max(nums[i],max);
            res = Math.max(res,maxEnd);
        }
        return res;
    }
}