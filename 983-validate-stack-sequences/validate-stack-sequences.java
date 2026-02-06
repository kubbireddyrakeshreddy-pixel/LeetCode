class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int k=-1;
        int j=0;
        for(int i=0 ;i<popped.length;i++){
             pushed[++k]=pushed[i];
             while(k>-1 && pushed[k]==popped[j]){
                 k--;
                 j++;
             }
             

        }

        return k==-1;
        
        
        }}