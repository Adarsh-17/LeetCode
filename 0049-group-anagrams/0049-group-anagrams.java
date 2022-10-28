class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String str = strs[i].toLowerCase();
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            str = String.valueOf(arr);
            if(!map.containsKey(str)){
              List<String> ip = new ArrayList<>();
              ip.add(strs[i]);
              map.put(str,ip);
            }
            else{
               map.get(str).add(strs[i]);
            }
        }
        return new ArrayList(map.values());
    }
}