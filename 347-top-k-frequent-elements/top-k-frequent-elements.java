class Pair{
    int freq;
    int elem;
    public Pair(int freq,int elem){
        this.freq=freq;
        this.elem =elem;
    }  
}
class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int l : nums){
            map.put(l,map.getOrDefault(l,0)+1);
        }
        //min heap
        PriorityQueue<Pair> pq = new PriorityQueue<>(
                        (a,b) -> {   if(a.freq != b.freq){
                                        return a.freq - b.freq;//min
                                     }
                                     else{
                                        return a.elem - b.elem;//min
                                     }
                                 }
                    
        );
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int elem = entry.getKey();
            int freq = entry.getValue();
            
            Pair curr = new Pair(freq,elem);

            if(pq.size()<k){
                pq.add(curr);
                continue;
            }
            if(curr.freq < pq.peek().freq)
            {
                continue;
            }
            else{
                pq.poll();
                pq.add(curr);
            }
        }; 
        
        int[] res = new int[k];
        int i =0;
        while(!pq.isEmpty()){
            res[i] = pq.poll().elem;
            i++;
        }

        return res;
    }
}