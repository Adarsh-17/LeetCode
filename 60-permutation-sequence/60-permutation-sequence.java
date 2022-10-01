class Solution {
    String str = "";
    public String getPermutation(int n, int k) {
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
           nums[i] = i + 1;
        }
        solve(nums, k);
        return str;
    }
    
    public void solve(int[] nums,int k){
        if(nums.length==1){
            str = str + nums[0];
            return;
        }
        int len = nums.length;
        int index = (k-1)/fact(len-1);
        str = str + nums[index];
        k = k - index*fact(len-1);
        int[] arr = new int[len-1];
        int j=0;
        int i=0;
        while(j<len-1){
            if(i==index){
                i++;
            }
            arr[j] = nums[i];
            j++;
            i++;
        }
        solve(arr,k);
    }
    
    public int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    
    
    
    
}