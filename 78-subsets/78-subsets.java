class Solution {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        solve(nums, list, 0);
        return output;
    }
    
    public void solve(int[] nums, List<Integer> list, int index){
        if(index == nums.length){
            output.add(new ArrayList(list));
            return;
        }
        
        solve(nums, new ArrayList(list), index+1);
        list.add(nums[index]);
        solve(nums, new ArrayList(list), index+1);
    }
    
    
}