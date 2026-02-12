class MyCircularQueue {
    int[] arr;
     int r=-1;
    int c=0;
    int f=0;
    int s;

    public MyCircularQueue(int k) {
        arr=new int[k];
       
        s=k;
        
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        r=(r+1)%s;
        arr[r]=value;
        c++;
        return true;
        
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        f=(f+1)%s;
        c--;
        return true;
        
    }
    
    public int Front() {
        if(isEmpty())
        { 
            return -1;
        }
        return arr[f];
        
    }
    
    public int Rear() {
        if(isEmpty())
        { 
            return -1;
        }
    
        return arr[r];

        
    }
    
    public boolean isEmpty() {
        return c==0;
        
    }
    
    public boolean isFull() {
        return c==s;
        
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */