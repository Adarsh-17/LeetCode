class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n = plantTime.length;

        Pair[] flowerTime = new Pair[n];

        for (int i = 0; i < n; i++) {

            flowerTime[i] = new Pair(plantTime[i], growTime[i]);

        }

        Arrays.sort(flowerTime, (a, b) -> b.growTime - a.growTime);

        int plantingDays = 0;

        int totalDays = 0;

        for (Pair current : flowerTime) {
            int max1;
            if(totalDays>=current.growTime){
              max1 = totalDays + current.plantTime;
            } else {
                max1 = current.plantTime + current.growTime;
            }
            int max2;
            if(current.growTime+current.plantTime>=totalDays-plantingDays){
              max2 = plantingDays + current.plantTime+current.growTime;
            } else {
                max2 = totalDays;
            }
            if(max1>=max2){
                totalDays = max2;
            }
            else {
                totalDays = max2;
            }
            plantingDays += current.plantTime;
        }

        return totalDays;
    }
    
    class Pair {

        public int plantTime;

        public int growTime;

        Pair(int plantTime, int growTime) {

            this.plantTime = plantTime;

            this.growTime = growTime;

        }

    }
}