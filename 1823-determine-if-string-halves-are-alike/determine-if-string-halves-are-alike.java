class Solution {
    public boolean halvesAreAlike(String s) {
        String str=s.toLowerCase();
        int len=str.length();
		int i=0;
		int mid=(len/2)-1;
		int j=len-1;
		int count=vowel_count(i,mid,str);
		int count1=vowel_count(mid+1,j,str);
		if(count==count1) {
			return true;
		}
		else {
		  return false;
		}
		
	}
	public static int vowel_count(int a,int b,String str) {
		int count2=0;
		while(a<=b) {
			if(str.charAt(a)=='a'||str.charAt(a)=='e'||str.charAt(a)=='i'||str.charAt(a)=='o'||str.charAt(a)=='u') {
				count2+=1;
			}
            a++;
		}
		
		return count2;
	}

    }
