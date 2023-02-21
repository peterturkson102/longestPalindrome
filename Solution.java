class Solution {
    public int longestPalindrome(String s) {
       int count =0;
       Map<Character, Integer> myMap = new HashMap<>();
        for (int i =0;i<s.length();i++){
            if(myMap.containsKey(s.charAt(i))){
               myMap.put(s.charAt(i),myMap.get(s.charAt(i))+1);
            }else{
                myMap.put(s.charAt(i),1);
            }
        }
        for(Map.Entry<Character, Integer> a : myMap.entrySet()){
            int num = a.getValue();
            if(num%2==0){
                count += num;
            }else{
                count += num-1;
            }
        }
        if(count<s.length()) count++;
    return count;
    }
}
