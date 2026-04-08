class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Stack <Integer> s=new Stack<>();
      Map<Integer,Integer> map=new HashMap<>();
      int[] arr=new int[nums1.length];
      for(int i:nums2){
         while(!s.isEmpty() && s.peek()<i){
            map.put(s.pop(),i);
         }
         s.push(i);
      }
      int k=0;
      for(int j:nums1){
       arr[k]=map.getOrDefault(j,-1);
       k++;
    }
    return arr;
}
}