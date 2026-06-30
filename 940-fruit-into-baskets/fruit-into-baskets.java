class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int low=0;
      
        int res=0;
        for(int high=0;high<fruits.length;high++){
            map.put(fruits[high],map.getOrDefault(fruits[high], 0) + 1);
            while(map.size()>2){
                if(map.get(fruits[low])==1){
                    map.remove(fruits[low]);
                }
                else{
                    map.put(fruits[low],map.get(fruits[low])-1);
                   
                }
                 low++;
            }
           
            int len = high-low+1;
            res=Math.max(res,len);
        
            
        }
        
        return res;
    }
}