class Pair{
    int freq;
    char letter;
    public Pair(int freq,char letter){
        this.freq= freq;
        this.letter=letter;
    }
}
class Solution {
    public String reorganizeString(String s) {

        StringBuilder res = new StringBuilder();

        HashMap<Character,Integer > map = new HashMap<>();

        // Store frequency of each character
        for (char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
                                if (a.freq != b.freq) {
                                        return b.freq - a.freq;//max
                                }
                                return Character.compare(b.letter, a.letter); // larger letter first
                                });

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            char letter= entry.getKey();
            int freq = entry.getValue();

            pq.add(new Pair(freq, letter));
        }

        while(!pq.isEmpty())
        {   
            Pair p = pq.poll();//delete
            
            if(res.length() == 0 || 
               res.charAt(res.length() - 1) != p.letter)
            {
                res.append(p.letter);
                p.freq--;
                if(p.freq>0){
                    pq.add(p);
                }
            }
            else{
                if(pq.isEmpty()){
                    return "";
                }
                Pair q = pq.poll();
                res.append(q.letter);
                q.freq--;
                if(q.freq>0)
                    pq.add(q);
                 
                pq.add(p);
            }
        }
        return res.toString();
    }
}