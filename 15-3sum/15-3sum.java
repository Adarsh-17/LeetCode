class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2 && nums[i]<=0;i++){
            if (i == 0 || nums[i - 1] != nums[i]) {
                twosum(i+1, nums, -1*nums[i], ans);
            }
        }
        return ans;
    }
    
    public void twosum(int index, int[] nums, int target, List<List<Integer>> ans){
        int start = index;
        int end = nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]==target){
                List<Integer> op = new ArrayList<>();
                op.add(nums[index-1]);
                op.add(nums[start++]);
                op.add(nums[end--]);
                ans.add(op);
                while(start<end && nums[start]==nums[start-1]){
                    start++;
                }
            } 
            else if(nums[start]+nums[end]>target){
                end--;
            }
            else {
                start++;
            }
        }
    }
}