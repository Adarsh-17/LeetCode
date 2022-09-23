class Solution {
    List<List<Integer>> op = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        rec(nums,0);
        return op;
    }
    
    public void rec(int[] nums, int index) {
        if(index==nums.length){
            List<Integer> bc = new ArrayList<>();
            op.add(bc);
            return;
        }
        rec(nums, index+1);
        int x = op.size();
        for(int i=0;i<x;i++){
             List<Integer> ans = new ArrayList<>(op.get(i));
               ans.add(nums[index]);
               op.add(ans);
        }
        return;
    }
}