class Solution {
    public int[] concatWithReverse(int[] nums) {
         int len = nums.length;

        int[] fun = new int[2 * len];

        for (int i = 0; i < 2 * len; i++) {

            if (i < len) {
                fun[i] = nums[i];
            } else {
                fun[i] = nums[2 * len - i - 1];
            }
        }

        return fun;
        
    }
}