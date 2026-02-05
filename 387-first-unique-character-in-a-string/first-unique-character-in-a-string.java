class Solution {
    public int firstUniqChar(String s) {
   LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
  for(int i=0;i<s.length();i++){
    if(map.containsKey(s.charAt(i))){
        map.put(s.charAt(i),map.get(s.charAt(i))+1);
    }
    else{
        map.put(s.charAt(i),1);
    }
  }
 for(Map.Entry <Character,Integer> e: map.entrySet()){
    if(e.getValue()==1){
        return s.indexOf(e.getKey());
    }
 }
 return -1;
   }
    }
  