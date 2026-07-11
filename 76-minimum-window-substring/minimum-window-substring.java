class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] freq = new int[128];

       
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int low = 0;
        int start = 0;
        int minLen = Integer.MAX_VALUE;

        int required = t.length();

        for (int high = 0; high < s.length(); high++) {

            char right = s.charAt(high);

          
            if (freq[right] > 0) {
                required--;
            }

            freq[right]--;

    
            while (required == 0) {

                if (high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    start = low;
                }

                char left = s.charAt(low);

                freq[left]++;

       
                if (freq[left] > 0) {
                    required++;
                }

                low++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}