class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr=new int[256];
        int[] arr1=new int[256];
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(arr[cs]==0 && arr1[ct]==0){
                arr[cs]=ct;
                arr1[ct]=cs;

            }
            else{
                if(arr[cs]!=ct || arr1[ct]!=cs){
                    return false;
                }
            }

        }
        return true;
    }
}