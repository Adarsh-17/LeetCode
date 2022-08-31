class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> ans = new ArrayList<>();
        int[] check = new int[nums.length+1];
       ans.add(new ArrayList<Integer>());
        int start = 0;
        check[0] = 1;
       for(int i=0;i<nums.length;i++){
           int len = ans.size();
           if(i!=0){
              if(nums[i]==nums[i-1]){
                  start = check[i-1];
              } else {
                  start = 0;
              }
           }
           for(int j=start;j<len;j++){
               List<Integer> op = new ArrayList<>(ans.get(j));
               op.add(nums[i]);
               ans.add(op);
           }
           check[i+1] = ans.size();
       }
       return ans;
    }
}