class Solution {
    public int search(int[] nums, int target) {
      int start=0;
      int finish=nums.length-1;
        while(start<=finish){
          int  mid=start+(finish-start)/2;
            if(target==nums[mid]){
            return mid;
        }
        else if(target<nums[mid]){
            finish=mid-1;
        }
        else if(target>nums[mid]){ 
            start=mid+1;


        }
        
    }
    return -1;
}
}