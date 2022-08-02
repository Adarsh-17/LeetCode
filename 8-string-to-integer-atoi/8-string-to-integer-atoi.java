class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int ans = 0;
        int sign = 1;
        int len = s.length();
        while(index<len  &&  s.charAt(index)==' '){
            index++;
        }
        if(index<len && (s.charAt(index)=='+' || s.charAt(index)=='-')){
            if(s.charAt(index)=='-'){
                sign = -1;
            }
            index++;
        }
        while(index<len  &&  Character.isDigit(s.charAt(index))){
            int digit = s.charAt(index) - '0';
             if ((ans > Integer.MAX_VALUE / 10) ||  (ans == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {         
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            ans = ans*10 + s.charAt(index) - '0';
            index++;
        }
        return sign*ans;
    }
}