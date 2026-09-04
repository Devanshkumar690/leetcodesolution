class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if(nums.length==1)
        {
            return 1;
        }
        int k = 1;
        int cm = 1;
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) 
        {
            if (nums[cm] == nums[cm - 1]) {
                cm++;
            } else {
                nums[k] = nums[cm];
                k++;
                cm++;
            }
        }
        
        return k;
    }
}