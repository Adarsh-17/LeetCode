class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
       int periods = minutesToTest/minutesToDie;
       int base = periods + 1;
       int count = 0;
       while(Math.pow(base,count)<buckets){
           count++;
       }
       return count;
    }
}