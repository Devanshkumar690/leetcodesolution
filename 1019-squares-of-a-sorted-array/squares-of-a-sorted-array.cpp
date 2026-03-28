class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int siz=nums.size();
        vector<int> pos;
        vector<int> neg;
        for(int i=0;i<siz;i++)
        {
            if(nums[i]<0)
            {
              neg.push_back(nums[i]);
            }
            else{
                    pos.push_back(nums[i]);
            }
        }
        
        if(neg.size()==0)
        {
            for(int i=0;i<pos.size();i++){
                pos[i]=pos[i]*pos[i];
            }
            return pos;
        }
        if(pos.size()==0)
        {
            for(int i=0;i<neg.size();i++){
                neg[i]=neg[i]*neg[i];
            }
            reverse(neg.begin(), neg.end());

            return neg;
        }
        int n=neg.size();
        int p=pos.size(); 
      
        vector<int> res(n+p);
        for(int i=0;i<pos.size();i++){
                pos[i]=pos[i]*pos[i];
            }
        for(int i=0;i<neg.size();i++){
                neg[i]=neg[i]*neg[i];
            }
            reverse(neg.begin(), neg.end());
        int i = 0;       
        int j =0;       
        int id=0; 

        while (i <n && j <p)
        {
            if (neg[i] <= pos[j])
            {
                res[id] = neg[i];
                i++;
                
            }
            else
            {
                res[id] = pos[j];
                j++;
            }
            id++;
        }

        
        while (j  <p)
        {
            res[id] = pos[j];
            j++;
            id++;
        }
        while (i<n)
        {
            res[id] = neg[i];
            i++;
            id++;
        }
        return res;
    }
};