class Solution {
    

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] proj = new int[profits.length][2];

        for(int i=0;i<n;i++){
            proj[i][0] = capital[i];
            proj[i][1] = profits[i];
        }

        Arrays.sort(proj,(a,b) -> a[0] - b[0]);//increasing order
        
        PriorityQueue<Integer> pq = new  PriorityQueue<>(Collections.reverseOrder());//max heap

        int idx = 0;
        

        while(k>0){
            while(idx<n){
                if(proj[idx][0] > w){
                    break;
                }
                pq.add(proj[idx][1]);
                idx++;
            }
            if(pq.isEmpty()){
                return w;
            }
            w += pq.poll();
            k--;
        }
        return w;

    }
}