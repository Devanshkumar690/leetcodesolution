class Solution {
    public int majorityElement(int[] nums) {
        int m = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > m / 2) {
                return entry.getKey();
            }
        }

        return -1;
    }
}