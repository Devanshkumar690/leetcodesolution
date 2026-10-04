
class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int res = -1;
        int maxFreq = 0;

        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {

            int num = entry.getKey();
            int freq = entry.getValue();

            if (num % 2 == 0) {

                if (freq > maxFreq) {
                    maxFreq = freq;
                    res = num;
                }
                else if (freq == maxFreq) {
                    res = Math.min(res, num);
                }
            }
        }

        return res;
    }
}

