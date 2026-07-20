class Solution {

    public int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            default: return 1000;
        }
    }

    public int romanToInt(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));

            if (i < s.length() - 1) {
                int next = value(s.charAt(i + 1));

                if (current < next) {
                    count -= current;
                } else {
                    count += current;
                }
            } else {
                count += current;
            }
        }

        return count;
    }
}