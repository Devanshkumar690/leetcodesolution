class Solution {
    public int provideAns(int m,int n,int guess)
    {   //O(n+m)
        int row = m;//last row
        int col = 1;//last col
        int count = 0;
        while(row >=1 && col<=n){
            if(row*col <= guess){
                count = count + row;
                col++;
            }
            else{
                row--;
            }
        }
        return count;
    }
    public int findKthNumber(int m, int n, int k) {
       int low=1;
       int high=m*n;

       int res=-1;

       //O(log(max element))
       while(low<=high){
        int guess = low + (high - low) / 2;
        int ans = provideAns(m,n,guess);
            if(ans<k){
                low=guess+1;
            }
            else{
                res=guess;
                high=guess-1;
            }
       }
       return res;

       //time complexity : Olog(max element) * O(n+m)
    }
}