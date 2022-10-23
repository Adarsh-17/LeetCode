class Solution {
    public int[] findErrorNums(int[] nums) {
        int diff = sum(nums.length) - arrSum(nums);
        int sqdiff = squareSum(nums.length) - arrSquareSum(nums);
        int[] ans = new int[2];
        ans[1] = ((sqdiff/diff) + diff)/2;
        ans[0] = ((sqdiff/diff) - diff)/2;
        return ans;
    }
    
    public int sum(int n){
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans = ans + i;
        }
        return ans;
    }
    
    public int arrSum(int[] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans = ans + nums[i];
        }
        return ans;
    }
    
     public int squareSum(int n){
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans = ans + i*i;
        }
        return ans;
    }
    
     public int arrSquareSum(int[] nums){
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            ans = ans + nums[i]*nums[i];
        }
        return ans;
    }
}