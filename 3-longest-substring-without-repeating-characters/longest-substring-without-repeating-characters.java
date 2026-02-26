
        class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0, max = 0;

        for (int r = 0; r < s.length(); r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}
        

/* Set<Character> set = new HashSet<>();
        int l= 0;
        int max = 0;
        int r=0;
        if(s.trim().length()!=s.length() || s.length()==1){
            return 1;
        }
        for(r=0;r<s.length();r++){
            if(set.contains(s.charAt(r)) ) {
                if(s.charAt(l)==s.charAt(r)){
                     max=Math.max(max,r-l);
                     l++;
                     set.remove(s.charAt(r));
                }
                else{
                max=Math.max(max,r-l);
                l=r;
                set.clear();
                }
            }

            else if(r==s.length()-1){
                return Math.max(max,r-l+1);

            }
           set.add(s.charAt(r));
        }
  return max; */