// sliding window pattern 2
// USED ON ( ARRAYS AND STRINGS) NOT ON LINKED LISTS
// GIVE IN SUBARRAY OR SUBSTRING PROBLEMS
// subsquence means non continous

// must be continous

// SUBARRAY OR SUBSTRING PROBLEMS ARE THOSE IN WHICH WE HAVE TO FIND A CONTIGUOUS PART OF AN ARRAY OR STRING THAT SATISFIES A CERTAIN CONDITION.


// ARE WE FINDING ?
// MAXIMUM OR MINIMUM OF A SUBARRAY OR SUBSTRING
// LONGEST OR SHORTEST SUBABARRAY OR SUBSRRAY OR SUBSTRING
// SUM OR COUNT OF STRING
// ATMOST K OR ATLEAST K OR EQUAL K DISTINCT ELEMENTS IN A SUBARRAY OR SUBSTRING  


// sliding window type
// .)fixed
// .)dynamic

// how to solve 
// 1)identify if it is a question of sliding window
// 2)fixed or variable
// 3)data /information (what is being asked)
// 4)new window information

// The thinking process for sliding-window problems

// Whenever you see a new sliding-window problem, ask yourself these questions:

// What does my window represent?
// A substring from low to high.
// When is the window valid?
// Here: windowLength - maxFrequency <= k.
// What information do I need to decide validity?
// Frequencies of characters.
// The maximum frequency in the window.
// When do I shrink?
// When the window becomes invalid.
// When do I update the answer?
// Whenever the window is valid.

// one question from gfg 
// 209,904,3,424(H)

// do write in notebook max funtion of java and how to a variable value as maximum or minimum
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



