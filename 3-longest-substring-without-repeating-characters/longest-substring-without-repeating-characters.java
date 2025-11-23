class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;
     for(int i=0;i<s.length();i++){
        String empty="";
        for(int j=i;j<s.length();j++){
            char ch=s.charAt(j);
            if(!empty.contains(""+ch)){
                empty+=ch;
                maxLength=Math.max(maxLength,empty.length());
            }else{
                break;
            }
        }
     } 
     return maxLength;  
    }
}