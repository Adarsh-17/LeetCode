class Pair {
    int start;
    int end;
    public Pair(int x,int y){
        this.start = x;
        this.end = y;
    }
}


class MyCalendar {
    ArrayList<Pair> myCal;
    public MyCalendar() {
       myCal = new ArrayList<Pair>();
    }
    
    public boolean book(int start, int end) {
        for(int i=0;i<myCal.size();i++){
          if (myCal.get(i).start < end && start < myCal.get(i).end) {
                return false;
            }
        }
        myCal.add(new Pair(start,end));
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */