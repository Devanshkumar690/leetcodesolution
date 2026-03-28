class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int i=0;
       int j=numbers.size()-1;
               while(i<j)
        {
               int a=numbers[i]+numbers[j];
                if(a==target)
                 return{i+1,j+1};
                else if(a<target)
                {
                    i++;
                 }
                else if (a>target)
                {
                    j--;
                }
        }
        return{};    
    }
};