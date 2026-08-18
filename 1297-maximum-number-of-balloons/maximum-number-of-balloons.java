class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> have = new HashMap<>();
        HashMap<Character,Integer> need = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for(char ch:text.toCharArray()){
            have.put(ch,have.getOrDefault(ch,0)+1);
        }
        
        need.put('b',1);
        need.put('a',1);
        need.put('l',2);
        need.put('o',2);
        need.put('n',1);
        for (char key : need.keySet()) {
            int min = have.getOrDefault(key,0)/need.getOrDefault(key,0);
            res = Math.min(res,min);
        }
        return res;

    }
}