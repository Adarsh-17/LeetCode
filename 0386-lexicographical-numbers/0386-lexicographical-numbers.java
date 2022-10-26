class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        int current = 1;
        for(int i=1;i<=n;i++){
          list.add(current);
          if(current*10<=n){
              current = current*10;
          }
          else if(current%10!=9 && current+1<=n){
              current++;
          }
          else{ 
               while((current/10)%10==9){
                   current = current / 10;
               }
              current = current/10+1;
                
          }
        }
        System.out.println(list.size());
        return list;
    }
}