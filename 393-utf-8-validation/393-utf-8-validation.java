class Solution {
    public boolean validUtf8(int[] data) {
        for(int i=0;i<data.length;i++){
            if(data[i]<128){
              
            } else if(data[i]>=192 && data[i]<224){
                if(i+1==data.length){
                    return false;
                }
                if(!check2(data,i+1)){
                    return false;
                }
                i++;
            } else if(data[i]>=224 && data[i]<240){
                if(i+2>=data.length){
                    return false;
                }
                 if(!check3(data,i+1)){
                    return false;
                }
                i = i + 2;
            } else if(data[i]>=240 && data[i]<248){
              if(i+3>=data.length){
                    return false;
                }
              if(!check4(data,i+1)){
                    return false;
                }
                i = i + 3;
            } else{
                return false;
            }
        }
        return true;
    }
    
    
    
     public boolean check2(int[] data,int index){
        if(data[index]>=128 && data[index]<192){
            return true;
        }
         return false;
    }
    
     public boolean check3(int[] data,int index){
         if(data[index]>=128 && data[index]<192 && data[index+1]>=128 && data[index+1]<192){
            return true;
        }
         return false;
    }
    
     public boolean check4(int[] data,int index){
        if((data[index]>=128 && data[index]<192)
           && (data[index+1]>=128 && data[index+1]<192) &&
           (data[index+2]>=128 && data[index+2]<192)){
            return true;
        }
         return false;
    }
}