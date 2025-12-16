class Solution {
    public boolean judgeCircle(String moves) {
        
        int up=0, down=0, left=0, right=0;
        for(char ch:moves.toCharArray()){
            if(ch=='U')up++;
            if(ch=='D')down++;
            if(ch=='L')left++;
            if(ch=='R')right++;
        }
        return up==down && left==right;
    }
}