class Solution {
    public int repeatedStringMatch(String a, String b) {
       StringBuilder str = new StringBuilder();
        int count = 0;
        int index = b.length()/a.length();
        for(int i=0;i<=index+2;i++){
            if(str.toString().contains(b)){
                return count;
            }
            else{
                str.append(a);
                count++;
            }
        }
        return -1;
    }
    
    
}