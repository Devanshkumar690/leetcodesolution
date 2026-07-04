class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map =new HashMap<>();
        int low =0;
        int res =0;
        int maxFreq =0;
        for(int high=0;high<s.length();high++){
            char ch = s.charAt(high);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

          
            maxFreq = Math.max(maxFreq, map.get(ch));    
            int len =high-low+1;
            while(len-maxFreq>k){
                char left =s.charAt(low);
                if(map.get(left)==1){
                    map.remove(left);
                }
                else{
                    map.put(left, map.get(left) - 1);
                }
                low++;
                
                len =high-low+1; 
             }
           
            res = Math.max(res,len);
        }
        
        return res;
    }
}