class Solution {
    public int trap(int[] height) {
        int lo = 0;
        int hi = height.length-1;
        int lmax = 0;
        int rmax = 0;
        int ans = 0;
        while(lo<=hi){
            lmax = height[lo]>lmax? height[lo] : lmax;
            rmax = height[hi]>rmax? height[hi] : rmax;
            if(lmax<rmax){
                ans += lmax - height[lo];
                lo++;
            }
            else {
                ans += rmax - height[hi];
                hi--;
            }
        }
        return ans;
    }
}