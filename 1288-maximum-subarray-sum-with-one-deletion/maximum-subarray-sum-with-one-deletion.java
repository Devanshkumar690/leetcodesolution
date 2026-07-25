class Solution {
    public int maximumSum(int[] arr) {
        int one_del = Integer.MIN_VALUE;
        int no_del  = arr[0];
        int res = arr[0];
        for(int i =1; i<arr.length;i++){
            int curr = arr[i];
            int prevno_del=no_del;
            int prevone_del=one_del;

            no_del=Math.max(no_del+curr,curr);
            int v2 = (prevone_del == Integer.MIN_VALUE)
                        ? Integer.MIN_VALUE
                        : prevone_del + arr[i];
            one_del=Math.max(v2,prevno_del);
            
            res = Math.max(res,Math.max(no_del,one_del));
        }
        return res;
    }
}