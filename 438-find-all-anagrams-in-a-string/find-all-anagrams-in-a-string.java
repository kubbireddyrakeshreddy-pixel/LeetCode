class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int n1=p.length();
        List<Integer> li=new ArrayList<>();
        char[] arr1=p.toCharArray();
        Arrays.sort(arr1);
        for(int i=0;i<n-n1+1;i++){
            char[] arr=s.substring(i,i+n1).toCharArray();
            Arrays.sort(arr);
            if(Arrays.equals(arr,arr1)){
                li.add(i);
            }
            
        }
       return li; 
    }
}