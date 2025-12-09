class Solution {
    public int countAsterisks(String s) {
        boolean found=false;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='|'){
                found=!found;
            }
               else if(ch=='*' && !found){
                    count++;
                }
            }
        return count;
    }
    }
