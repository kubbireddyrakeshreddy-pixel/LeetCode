class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxi=nums[0];
        int currsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currsum=Math.max(nums[i],nums[i]+currsum);
            maxi=Math.max(maxi,currsum);

        }
        return maxi;
    }
}