class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int n : piles){
            high=Math.max(high,n);
        }
        int res=-1;
        while(low<=high){
            long hours=0;
            int guess=low + (high - low) / 2;
            for( int n : piles){
                hours+=n/guess;
                if(n%guess != 0 )
                    hours++;
            }

            if(hours>h){//no
                low=guess+1;
            }
            else{//yes
                res=guess;
                high=guess-1;
            }
            
        }
        return res;
    }
}