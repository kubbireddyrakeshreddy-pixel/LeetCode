class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();
        while(n!=1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            Stack<Integer> s=new Stack<>();
            while(n>0){
                int num=n%10;
                s.push(num);
                n=n/10;
            }
            int sum=0;
            while(!s.isEmpty()){
                int digit=s.pop();
                sum=sum+(digit*digit);
            }
            n=sum;
        }
        
        return true;
    }
}