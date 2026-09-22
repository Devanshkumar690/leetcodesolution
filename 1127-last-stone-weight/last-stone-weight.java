class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int n : stones){
            pq.add(n);
        }

        while(pq.size() > 1)
        {
            int max1 = pq.poll();
            int max2 = pq.poll();

            if(max1 != max2){
                int diff = Math.abs(max1 - max2);
                pq.add(diff);
            }
        }
        if(pq.isEmpty()){
            return 0;
        }
        return pq.peek();
    }
}