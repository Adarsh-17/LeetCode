class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        if(!map.containsKey(nums[0]%k)){
             map.put(nums[0]%k,0);
        }
       
        for(int i=1;i<nums.length;i++){
            nums[i] = nums[i] + nums[i-1];
            if(!map.containsKey(nums[i]%k)){
                map.put(nums[i]%k,i);
            }
            else if(map.get(nums[i]%k)<i-1){
                return true;
            } 
        }
        return false;
    }
}