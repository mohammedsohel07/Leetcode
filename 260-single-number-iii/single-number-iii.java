class Solution {
    public int[] singleNumber(int[] nums) {
         Map<Integer,Integer> map=new HashMap<>();
            for(int n:nums){
                map.put(n,map.getOrDefault(n,0)+1);
            }
            int[] arr=new int[2];
            int index=0;
            for(int n:map.keySet()){
                if(map.get(n)==1){
                    arr[index++]=n;
                }
            }
            return arr;
    }
}