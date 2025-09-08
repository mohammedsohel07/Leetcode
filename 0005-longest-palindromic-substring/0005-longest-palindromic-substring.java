class Solution {
    public String longestPalindrome(String s) {
        for(int size=s.length();size>=1;size--)
        {
            for(int i=0;i<=s.length()-size;i++)
            {
            String a=s.substring(i,i+size);
         if(isPalindrome(a))
         {
            return a;
         } 
        }
        }
        return "";
    
    }
    public static boolean isPalindrome(String s)
    {
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}