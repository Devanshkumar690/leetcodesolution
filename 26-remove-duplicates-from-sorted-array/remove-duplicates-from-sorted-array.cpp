class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
   
    int k = 1;
    int officer = 0;
    int cm = 1;

    int length = nums.size();

    for(int i = 0; i < length - 1; i++) {

        if(nums[cm] == nums[cm-1])
            cm++;
        else{
            nums[officer+1] = nums[cm];
            k++;
            officer++;
            cm++;
        }
    }



    for(int i = 0; i < k; i++){
        cout << nums[i] << " ";
    }
    return k;
    }
};