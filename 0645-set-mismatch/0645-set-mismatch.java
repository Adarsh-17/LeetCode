class Solution {
    public int[] findErrorNums(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=(i+1) && nums[nums[i]-1]!=nums[i] && count<10){
                int x = i;
                int y = nums[i] - 1;
                swap(nums,x,y);
            }
            System.out.println();
            }
           
        int[] ans = new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }

    public static void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    } 
}