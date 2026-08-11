class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        //this question is of greater next
        int n=temperatures.length;
        Deque<Integer> stack = new ArrayDeque<>();
        int res[] = new int[n];           
        res[n-1]=0; 
        stack.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(!stack.isEmpty() && temperatures[stack.peek()]<=temperatures[i])
            {
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=0;
                stack.push(i);
            }
            else{
                res[i]=stack.peek()-i;
                stack.push(i);
            }
        }
        return res;



    }
}