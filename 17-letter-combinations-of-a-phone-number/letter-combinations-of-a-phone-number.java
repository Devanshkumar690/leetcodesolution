class Solution {

    public void fun(String digits , int n, int idx , StringBuilder diary , List list,HashMap<Character,String> map )
    {
        if(idx == n) {
            list.add(diary.toString());
            return;
        }

        String choice =  map.get(digits.charAt(idx));

        int m = choice.length();

        for (int j = 0; j < choice.length(); j++) {

            diary.append(choice.charAt(j));

            fun(digits, n, idx + 1, diary, list, map);

            diary.deleteCharAt(diary.length() - 1);
        }

        return;
    }



    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();

        if (digits.length() == 0) {
            return list;
        }

        int n = digits.length();

        int idx = 0;

        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        StringBuilder diary = new StringBuilder();

        

        fun(digits,n,idx,diary,list,map);

        return list;
    }
}