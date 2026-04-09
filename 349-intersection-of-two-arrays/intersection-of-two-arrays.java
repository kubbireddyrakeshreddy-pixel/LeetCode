class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int j=0;j<nums1.length;j++){
            set.add(nums1[j]);
        }
        Set<Integer> set1=new HashSet<>();
        for(int i:nums2){
            if(set.contains(i)){
                  set1.add(i);
            }
        }
        List<Integer> list = new ArrayList<>(set1);
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);

        }
        return arr;

    }
}