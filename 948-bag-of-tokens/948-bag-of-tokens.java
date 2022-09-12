class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==0){
            return 0;
        }
        Arrays.sort(tokens);
        int score = 0;
        int maxscore = 0;
        int left = 0;
        int right = tokens.length-1;
        if(power<tokens[0]){
            return 0;
        }
        while(left<=right){
            if(tokens[left]<=power){
                power = power - tokens[left];
                score++;
                left++;
                System.out.println("left");
            }
            else{
                score--;
                power += tokens[right];
                right--;
                System.out.println("right");
            }
            maxscore = score>maxscore?score:maxscore;
        }
        return maxscore;
    }
}