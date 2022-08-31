class Solution {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        subsetsHelp(nums,0);
        return output;
    }
    
    public void subsetsHelp(int[] nums,int index){
        if(index==nums.length){
            output.add(new ArrayList<Integer>());
            return;
        }
        subsetsHelp(nums,index+1);
        int len = output.size();
        for(int i=0;i<len;i++){
            List<Integer> ans = new ArrayList<>(output.get(i));
            ans.add(nums[index]);
            output.add(new ArrayList<>(ans));
        }
        return;
    }
}