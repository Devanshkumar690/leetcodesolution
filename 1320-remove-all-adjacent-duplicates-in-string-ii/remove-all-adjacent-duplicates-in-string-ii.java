class Solution {
    public String removeDuplicates(String s, int k) {
        Deque<Pair> stack = new ArrayDeque<>();
        
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().ch == ch){
                stack.peek().count++;
                if(stack.peek().count==k){
                    stack.pop();
                }
            }
            else{
                stack.push(new Pair(ch,1));
            }        
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            Pair curr = stack.removeLast();
            for(int i=0;i<curr.count;i++){
                sb.append(curr.ch);
            }
        }
        return sb.toString();

    }

    static class Pair{
        char ch;
        int count;
        Pair(char ch,int count){
            this.ch=ch;
            this.count=count;
        }
    }
}