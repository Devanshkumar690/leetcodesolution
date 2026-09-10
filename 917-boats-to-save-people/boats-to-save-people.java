class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int low=0;
        int high=n-1;
        int count =0;
        Arrays.sort(people);
        while(low <= high){
            int sum = people[low] + people[high];
            if(sum <= limit){
                low++;
            }
            high--;
            count++;

        }
        return count;
    }
}