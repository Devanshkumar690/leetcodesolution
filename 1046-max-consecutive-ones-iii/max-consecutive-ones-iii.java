class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int low = 0;
        int num =0;
        int maxlen=Integer.MIN_VALUE;
        for(int high =0;high<nums.length;high++)
        {
            if(nums[high]==0){
                num++;
            }
           
            
            while(num>k){
                if(nums[low]==0){
                    num--;
                }
                low++;
            }
            maxlen = Math.max(maxlen, high - low + 1);

        }
        return maxlen;
    }
}