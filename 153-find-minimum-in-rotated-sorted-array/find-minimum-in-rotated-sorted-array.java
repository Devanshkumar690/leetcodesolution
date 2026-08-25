class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=nums.length-1;
        int res =0;
        while(low<=high){
            int gus=(low+high)/2;
            if(nums[gus]>nums[n-1]){
                low=gus+1;
            }
            else{
                res=nums[gus];
                high=gus-1;
            }
        }
        return res;
    }
}