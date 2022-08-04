class Solution {
    public int mirrorReflection(int p, int q) {
        int ext = lcm(p,q)/p;
        int ref = lcm(p,q)/q;
        System.out.println(lcm(p,q));
        
        if(ext%2==0 && ref%2==1){
            return 0;
        } else if(ext%2==1 && ref%2==0){
            return 2;
        } else if(ext%2==1 && ref%2==1){
            return 1;
        }
        return 0;
    }
    
    public int lcm(int p,int q){
        int x = p>q? p : q;
        int y = p>q? q : p;
        int count = 1;
        while(!((x*count)%y==0)){
            count++;
            System.out.println(x*count);
        }
        return x*count;
    }
}