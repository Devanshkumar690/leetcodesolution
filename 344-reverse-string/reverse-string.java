class Solution {

    public void fun(char[] s,int low , int high){
        
        //handles both even and odd case
        if(low>=high){
            return;
        }
        
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        
            
        
        fun(s,low+1,high-1);
    }


    public void reverseString(char[] s) {
        
        int low = 0;
        int high= s.length-1;
        fun(s,low,high);
    }
}
