class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int  ele=target-nums[i];
            for(int j=i+1;j<n;j++){
                if(ele!=nums[j]){
                   continue;
                }
                else{
                     arr[0]=i;
                    arr[1]=j;
                    return arr;
                 

                }
            }
        }
        return arr;
    }
}    