class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 2 * n - 1; i >= 0; i--) {
            int curr = nums[i % n];
            while(!stack.isEmpty() && stack.peek() <= curr) {
                stack.pop();
            }
            if(i < n) {
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(curr);
        }
        return ans;
    }
}