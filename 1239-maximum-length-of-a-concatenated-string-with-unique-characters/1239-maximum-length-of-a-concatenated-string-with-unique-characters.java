class Solution {
    int maxlength = 0;
    public int maxLength(List<String> arr) {
        maxLengthHelper(arr,0,"");
        return maxlength;
    }
    
    public void maxLengthHelper(List<String> arr,int index,String str){
        if(index==arr.size()){
            maxlength = str.length()>maxlength? str.length(): maxlength;
            return;
        }
        
        if(!checkDuplicate(arr.get(index)) && !checkDuplicate(arr.get(index)+str)){
            maxLengthHelper(arr,index+1,str+arr.get(index));
        }
        maxLengthHelper(arr,index+1,str);
    }
    
    public boolean checkDuplicate(String str){
        char[] chars = str.toCharArray();
     
    Map<Character, Integer> map = new HashMap<>();
    for(char c : chars) 
    {
      if(map.containsKey(c)) {
        int counter = map.get(c);
        map.put(c, ++counter);
      } else {
        map.put(c, 1);
      }
    }
     
    //Print duplicate characters
    for(char c : map.keySet()) {
      if(map.get(c) > 1) {
        return true;
      }
      }
        return false;
    }
}