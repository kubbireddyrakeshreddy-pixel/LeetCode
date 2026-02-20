class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li=new ArrayList<>();
        int n=candies.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<=candies[i]){
                max=candies[i];
            }
            

        }
      
        for(int i=0;i<n;i++){
             int  max1=max;
           int can= candies[i]+extraCandies;
           if(can>=max1){
            max1=can;
            li.add(true);
           }
           else{
            li.add(false);
           }
             
        }
        return li;
        
    }
}