class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int wordptr1 = 0;
        int wordptr2 = 0;
        int stringptr1 = 0;
        int stringptr2 = 0;
        while(wordptr1<word1.length && wordptr2<word2.length){
            if(word1[wordptr1].charAt(stringptr1++)!=word2[wordptr2].charAt(stringptr2++)){
                return false;
            } 
            if(stringptr1==word1[wordptr1].length()){
                stringptr1 = 0;
                wordptr1++;
            }
            if(stringptr2==word2[wordptr2].length()){
                stringptr2 = 0;
                wordptr2++;
            }
        }
        return wordptr1==word1.length && wordptr2==word2.length;
    }
}