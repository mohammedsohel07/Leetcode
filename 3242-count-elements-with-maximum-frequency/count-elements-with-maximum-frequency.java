class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int maxFreq=0;
        int result=0;
         for(int num:nums){
            int freq=map.getOrDefault(num,0)+1;
            map.put(num,freq);
            if(freq>maxFreq){
                maxFreq=freq;
                result=freq;
            }else if(freq==maxFreq){
                result+=freq;
            }
         }
         return result;

    }
}