class Solution {

    public void fun(  int open , int close , int n ,StringBuilder tmp , List<String> list){
        if(open == n && close == n){
            list.add(tmp.toString());
            return;
        }

        //open bracket choice 
        if(open < n){
            tmp.append('(');
            fun(open+1,close,n,tmp,list);
            tmp.deleteCharAt(tmp.length() - 1);
        }

        //close bracket choice

        if(close < open){
            tmp.append(')');
            fun(open,close+1,n,tmp,list);
            tmp.deleteCharAt(tmp.length() - 1);
        }

    }
    public List<String> generateParenthesis(int n) {
        
        StringBuilder tmp = new StringBuilder();

        List<String> list = new ArrayList<>();

        fun(0,0,n,tmp,list);

        return list;
    }
}