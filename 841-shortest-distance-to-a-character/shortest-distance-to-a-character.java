class Solution {
    public int[] shortestToChar(String s, char c) {
        int n=s.length();
        int[] distance=new int[n];
        int prev=-n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c)prev=i;
            distance[i]=i-prev;
        }
        prev=2*n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==c)prev=i;
            distance[i]=Math.min(distance[i],prev-i);
        }
        return distance;
    }
}