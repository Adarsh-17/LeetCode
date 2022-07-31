class Solution {
    public int[] twoSum(int[] nums, int target) {
       int[] rv = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    rv[0] = i;
                    rv[1] = j;
                    return rv;
                }
            }
        }
        return rv; 
    }
}