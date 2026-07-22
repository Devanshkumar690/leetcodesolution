class Solution {
     int squ(int n){
            int sum =0;
            while(n>0)
            {
             int d=n%10;
             sum = sum + d*d;
             n = n/10;
            }
            return sum;
        }
    public boolean isHappy(int n) {
       
        int slow =n;
        int fast =n;
        do{
            slow = squ(slow);
            fast = squ(squ(fast));
        }while(slow != fast);

        return slow==1;
    }
}