class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int guess = low + (high - low) / 2;
            if (guess % 2 == 0) {
                if (nums[guess] == nums[guess + 1]) {
                    low = guess + 2;
                } else {
                    high = guess;
                }

            } else {
                if (nums[guess] == nums[guess - 1]) {
                    low = guess + 1;
                } else {
                    high = guess - 1;
                }
            }
        }

        return nums[low];
    }
}