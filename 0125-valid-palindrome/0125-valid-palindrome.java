class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        int i=0;
        int j=cleaned.length()-1;
        while(i<j){
           if(cleaned.charAt(i)!=cleaned.charAt(j)){
           return false;
           }
           i++;
           j--;
           }
        return true;
    }
    }
