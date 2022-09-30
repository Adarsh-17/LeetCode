class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        solve(candidates, target, 0, new ArrayList());
        return ans;
    }
    
    public void solve(int[] candidates, int target, int index, List<Integer> list){
       if(target<0){
           return;
       }
       if(target==0){
          ans.add(new ArrayList(list));
           return;
        }
        for(int i=index;i<candidates.length;i++){
            if(target-candidates[i]<0){
                break;
            }
            ArrayList<Integer> input = new ArrayList(list);
            input.add(candidates[i]);
            solve(candidates,target-candidates[i], i, new ArrayList(input));
        }
    }
}