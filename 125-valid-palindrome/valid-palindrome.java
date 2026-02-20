class Solution {
    public boolean isPalindrome(String s) {
        /*StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }
       sb= new StringBuilder((sb.toString()).toLowerCase());
        int j=sb.length()-1;
        int i=0;
        while(i<=j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            j--;
            i++;
            
        }
return true;  */
       s= s.replaceAll("[^a-zA-Z0-9]","");
       s=s.toLowerCase();
       int j=s.length()-1;
        int i=0;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            j--;
            i++;
            
        }
return true; 

        }
}
        
    
