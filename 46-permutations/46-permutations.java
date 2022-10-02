class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        solve(0,nums);
        return ans;
    }
    
    public void solve(int first,int[] nums){
        if(first==nums.length-1){
            List<Integer> list = new ArrayList<>();
            for(int x: nums){
                list.add(x);
            }
            ans.add(new ArrayList(list));
            return;
        }
        for(int i=first;i<nums.length;i++){
            swap(nums,i,first);
            solve(first+1,nums);
            swap(nums,i,first);
        }
    }
    
    public void swap(int[] nums,int i,int j){
        int k = nums[i];
        nums[i] = nums[j];
        nums[j] = k;
    }
    
    
}