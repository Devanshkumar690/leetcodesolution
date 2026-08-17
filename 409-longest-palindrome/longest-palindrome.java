class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int length=0;
        boolean hasodd= false;
        for(int freq: map.values()){
            length+=(freq/2)*2;
            if(freq %2 ==1){
                hasodd=true;
            }
        }
        if(hasodd){
            length++;
        }
        return length;

    }
}