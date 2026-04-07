class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li=new ArrayList<>();
        Set<Integer> s=new TreeSet<>();
        Arrays.sort(nums);
        for(int i:nums){
            s.add(i);
        }
         
        int n=nums.length;
        
        
        for(int i=1;i<=n;i++){
            if(!s.contains(i)){
                li.add(i);
                
            }
           
        }
        return li;
    }
}