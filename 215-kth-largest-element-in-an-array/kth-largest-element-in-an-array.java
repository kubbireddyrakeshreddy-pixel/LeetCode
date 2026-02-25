class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min=new PriorityQueue<>(Collections.reverseOrder());
        int len=nums.length;
        for(int i=0;i<len;i++){
               min.offer(nums[i]);
        }
        for(int i=0;i<k-1;i++){
            min.poll();
        }
        return min.peek();
      
    }
}


/* Arrays.sort(nums);
        int len=nums.length;
         return nums[len-k];
        */