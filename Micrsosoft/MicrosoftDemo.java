class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] words=s.split(" ");
     if (words.length != pattern.length()) {
            return false;
        }
       Map<Character,String> map=new HashMap<>();
      
       for(int i=0;i<words.length;i++){
           Character c=pattern.charAt(i);
           String word=words[i];
           if(map.containsValue(word) && !map.containsKey(c))return false;
           if (!map.containsKey(c)){
               map.put(c,word);
           }else{
               String temp=map.get(c);
               if(!temp.equals(word)) return false;
           }
       }
    return true;
    }
}