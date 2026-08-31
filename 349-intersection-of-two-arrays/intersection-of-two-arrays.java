class Solution {
   
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n:nums1){
            map.put(n,1);
        }

        for(int n : nums2){
            if(map.containsKey(n)){
                list.add(n);
                map.remove(n);
            }
        }
        
        int[] arr = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
    return arr;
    }
}