class Solution {
    public boolean isSameAfterReversals(int num) {
        int res = num;
        if(num == 0){
            return true;
        }
       
        return res%10 == 0 ? false: true;
    }
}