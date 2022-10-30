class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        int digits = (int)(Math.log(n)/Math.log(10))+1;
        int[] number = new int[digits+1];
        int[] prefixsum = new int[digits+1];
        long num = n;
        int index = number.length-1;
        while(index>=0){
            number[index] = (int)(num%10);
            num = num/10;
            index--;  
        }
        prefixsum[0] = number[0];
        for(int i=1;i<number.length;i++){
            prefixsum[i] = prefixsum[i-1] + number[i];
        }
        for(int i=number.length-1;i>=0;i--){
            if(prefixsum[i]>target){
                if(number[i]!=0){
                number[i] = 0;
                number[i-1]++; 
                prefixsum[i-1]++;
                }
            }
            else{
                break;
            }
        }
        long pow = 1;
        long ans = 0;
        for(int i=number.length-1;i>=0;i--){
            System.out.println(number[i]);
            ans = pow*number[i]+ans;
            pow = pow*10;
        }
        return ans-n;
    }
}