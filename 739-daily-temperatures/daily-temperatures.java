class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int[] arr=new int[temperatures.length];
        s.push(0);
        for(int i=0;i<temperatures.length;i++){
       while(!s.isEmpty() && temperatures[s.peek()]<temperatures[i]){
        int k=s.pop();
        arr[k]=i-k;
       }
       s.push(i);
        }

        return arr;
    }
}
