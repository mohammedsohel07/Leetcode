class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String empty="";
        for(int i=s.length()-1;i>=0;i--)
        {
             char ch=s.charAt(i);
            if(ch==' ')
            {
                if(count>0)break;
            }
                else{
                count++;
                }
            }
        
        return count;
    }
    }
