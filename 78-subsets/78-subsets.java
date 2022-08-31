class Solution {
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
       ans.add(new ArrayList<Integer>());
       for(int i=0;i<nums.length;i++){
           int len = ans.size();
           for(int j=0;j<len;j++){
               List<Integer> op = new ArrayList<>(ans.get(j));
               op.add(nums[i]);
               ans.add(op);
           }
       }
       return ans;
    }
}