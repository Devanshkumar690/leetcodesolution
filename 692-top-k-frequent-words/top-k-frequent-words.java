class Pair{
    int freq;
    String word;
    public Pair(int freq,String word){
        this.freq=freq;
        this.word =word;
    }  
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer > map = new HashMap<>();

        for (String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
                                if (a.freq != b.freq) {
                                        return a.freq - b.freq;//min
                                }

                                return b.word.compareTo(a.word);
                                });

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            int freq = entry.getValue();
            
            Pair curr = new Pair(freq,word);

            if(pq.size()<k){
                pq.add(curr);
                continue;
            }

            if (curr.freq > pq.peek().freq ||
                        (curr.freq == pq.peek().freq 
                        &&
                        curr.word.compareTo(pq.peek().word) < 0)) {

                pq.poll();
                pq.add(curr);
            }
        }; 
        

        String [] res = new String[k];
        int i =k-1;
        while(!pq.isEmpty()){
            res[i] = pq.poll().word;
            i--;
        }

        return Arrays.asList(res);
    }
}