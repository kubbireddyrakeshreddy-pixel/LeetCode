class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        char temp;
        int j=len-1;
        int i=0;
        while(i<j){
           temp= s[i];
           s[i]=s[j];
           s[j]=temp;
           i++;
           j--;

        }
        
    }
}