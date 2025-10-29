class Solution {
    public int dominantIndex(int[] nums) {
        int firstmax=-1,secondmax=-1,index=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstmax){
                secondmax=firstmax;
                firstmax=nums[i];
                index=i;
            }else if(nums[i]>secondmax){
                    secondmax=nums[i];
            }
        }
        return firstmax>=2 * secondmax? index : -1;
    }
}