class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Integer> min = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));
        int[] arr = new int[k];
        
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for(int e: map.keySet()){
            min.offer(e);
            if(min.size() > k){
                min.poll();
            }
        }
        
        for(int i = 0; i <k; i++){
            arr[i] = min.poll();
        }
        
        return arr;
    }
}