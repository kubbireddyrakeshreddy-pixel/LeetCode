class Solution {
    public int findKthLargest(int[] nums, int k) {
         int len=nums.length;
         Arrays.sort(nums);
         return nums[len-k];
      
    }
}


/* Arrays.sort(nums);
        int len=nums.length;
         return nums[len-k];


         ----------meethod 2
         PriorityQueue<Integer> min=new PriorityQueue<>(Collections.reverseOrder());
        int len=nums.length;
        for(int i=0;i<len;i++){
               min.offer(nums[i]);
        }
        for(int i=0;i<k;i++){
            min.poll();
        }
        return min.peek();
        */