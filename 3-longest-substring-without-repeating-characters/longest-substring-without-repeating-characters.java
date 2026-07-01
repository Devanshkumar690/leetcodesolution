import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int res = 0;

        for (int high = 0; high < s.length(); high++) {

            map.put(s.charAt(high), map.getOrDefault(s.charAt(high), 0) + 1);

           
            while (map.get(s.charAt(high)) > 1) {

                char left = s.charAt(low);

                if (map.get(left) == 1) {
                    map.remove(left);
                } else {
                    map.put(left, map.get(left) - 1);
                }

                low++;
            }

            res = Math.max(res, high - low + 1);
        }

        return res;
    }
}