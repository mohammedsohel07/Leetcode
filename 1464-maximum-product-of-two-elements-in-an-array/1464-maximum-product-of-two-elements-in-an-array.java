class Solution {
    public int maxProduct(int[] nums) {
        int firstmax=0;
        int secondmax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>firstmax){
                secondmax=firstmax;
                firstmax=nums[i];
            }else if(nums[i]>secondmax && nums[i]!=0){
                secondmax=nums[i];
            }
        }
        return (firstmax-1)*(secondmax-1);
    }
}