class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int i=0;i<n;i++){
            int left=0, right=image[i].length-1;
            while(left<=right){
                int temp=image[i][left]==0?1:0;
                image[i][left]=image[i][right]==0?1:0;
                image[i][right]=temp;
                left++;
                right--;

            }
        }
            return image;
    
}
}