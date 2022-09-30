class Solution {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<Integer> list = new ArrayList<>();
        solve(nums, list, 0);
        return output;
    }
    
     public void solve(int[] nums, List<Integer> list, int index){
        if(index == nums.length){
            output.add(new ArrayList(list));
            return;
        }
        int ptr = index;
        while(ptr+1<nums.length && nums[ptr]==nums[ptr+1]){
            ptr++;
        }
         
        solve(nums, new ArrayList(list), ptr+1);
        list.add(nums[index]);
        solve(nums, new ArrayList(list), index+1);
    }
}