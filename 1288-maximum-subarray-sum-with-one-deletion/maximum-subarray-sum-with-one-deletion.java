class Solution {
    public int maximumSum(int[] arr) {
        int one_del = arr[0];
        int no_del  = arr[0];
        int res = arr[0];
        for(int i =1; i<arr.length;i++){
            int prevno_del=no_del;
            int prevone_del=one_del;

            no_del=Math.max(no_del+arr[i],arr[i]);
            int v2;
            if(prevone_del==Integer.MIN_VALUE){
                v2=arr[i];
            }
            else{
                v2=prevone_del+arr[i];
            }
            one_del=Math.max(v2,prevno_del);
            int max =Math.max(no_del,one_del);
            res = Math.max(res,max);
        }
        return res;
    }
}