class Solution {
    public boolean valid(int[] freqs,int[] freqt){
            for(int i=0;i<128;i++){
                if(freqs[i]<freqt[i]){
                    return false;
                }
            }
            return true;
    }
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        int[] freqt = new int[128];
        for(int i=0;i<t.length();i++){
            freqt[t.charAt(i)]++;
        }
        int low=0;
        int res= Integer.MAX_VALUE;
        int[] freqs = new int[128];
        int start=0;
        for(int high =0;high<s.length();high++){
            freqs[s.charAt(high)]++;

            while(valid(freqs,freqt)){
                int len =high-low+1;

                if(res>len){
                    res=len;
                    start = low;
                }
                freqs[s.charAt(low)]--;
                low++;
            }
        }
        return res == Integer.MAX_VALUE
                ?""
                :s.substring(start,start +res);
        
    }
}