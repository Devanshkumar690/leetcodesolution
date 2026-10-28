class Solution {


public void fun(int[] candidates, int n ,int idx,List<Integer> diary, int sum, List<List<Integer>> res, int target)
{

     // Base case
        if (sum == target) {
            res.add(new ArrayList<>(diary));
            return;
        }

        if (idx == n || sum > target) {
            return;
        }

    //nahi lena hai

    fun(candidates,n,idx+1,diary,sum,res,target);

    //lena hai

    //check if sum less than target

    if(candidates[idx] + sum <= target) {

        diary.add(candidates[idx]);
        sum = sum+candidates[idx];
        fun(candidates,n, idx , diary,sum,res,target);
        diary.remove(diary.size()-1);//backtrack
        sum = sum - candidates[idx];

    }

    return ;

}
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length;

        int sum =0 ;

        List<Integer> diary = new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        int idx =0;

        fun(candidates, n,idx,diary ,sum , res , target) ;

        return res;
    }
}