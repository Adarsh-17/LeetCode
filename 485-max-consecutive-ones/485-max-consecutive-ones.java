class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current_length = 0;
        int max_length = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                current_length++;
                max_length = current_length>max_length? current_length : max_length;
            }
            else{
                current_length = 0;
            }
        }
        return max_length;
    }
}