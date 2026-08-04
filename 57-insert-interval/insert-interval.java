class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if(intervals.length == 0){
            return new int[][]{newInterval};
        }
        
        List<int[]> insert = new ArrayList<>();
        boolean inst = false;
        for(int[] interval : intervals){
            if(!inst && interval[0] > newInterval[0]){
                insert.add(newInterval);
                inst = true;
            }
            insert.add(interval);
        }
        if(!inst){
            insert.add(newInterval);
        }
        int start1=insert.get(0)[0];
        int end1=insert.get(0)[1];
        List<int[]> res = new ArrayList<>();
        
        for(int i=1;i<insert.size();i++){
            int start2=insert.get(i)[0];
            int end2=insert.get(i)[1];
            if(end1>=start2){
                end1=Math.max(end1,end2);
                continue;
            }
            res.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
        }
        res.add(new int[]{start1,end1});
       
        return res.toArray(new int[0][]);
    }
}