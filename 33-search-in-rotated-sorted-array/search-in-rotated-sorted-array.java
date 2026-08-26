class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int gus=(low+high)/2;
            if(nums[gus]==target){
                return gus;
            }
            // part 1 or left
            if(nums[gus]>nums[n-1]){
                if(nums[gus]<target)
                    low=gus+1;
                else{//a[gus]>target
                    if(nums[0]>target)
                        low=gus+1;//right
                    else{
                        high=gus-1;//left
                    }
                }
                continue;
            }
            //part 2
            if(nums[gus]>target){
                high=gus-1;//left
            }
            else{
                if(nums[n-1]<target){
                    high=gus-1;
                }
                else
                    low=gus+1;
            }

        }
        return -1;
    }
}