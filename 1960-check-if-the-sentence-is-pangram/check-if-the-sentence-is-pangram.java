class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character, Integer> map = new HashMap<>();

        //i know array can be used instead of hashmap because their is no need of counting
        for (int i = 0; i < sentence.length(); i++) {
            map.put(sentence.charAt(i),map.getOrDefault(sentence.charAt(i),0)+1);
        }  


        return map.size() == 26;

    }
}