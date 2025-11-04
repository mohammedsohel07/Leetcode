class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0;
        int highestAltitude=0;
        for(int gained: gain){
            altitude +=gained;
            if(altitude>highestAltitude){
                highestAltitude=altitude;
            }
        }
        return highestAltitude;
    }
}