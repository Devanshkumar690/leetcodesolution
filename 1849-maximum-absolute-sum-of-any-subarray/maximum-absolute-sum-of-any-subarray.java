class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int res =nums[0];
        int minEndingHere=nums[0];
        int maxEndingHere=nums[0];
        for(int i=1;i<nums.length;i++){
            minEndingHere=Math.min(minEndingHere+nums[i],nums[i]);
            maxEndingHere=Math.max(maxEndingHere+nums[i],nums[i]);
            res=Math.max(res,Math.max(maxEndingHere,Math.abs(minEndingHere)));
        }
        return Math.abs(res);
    }
}