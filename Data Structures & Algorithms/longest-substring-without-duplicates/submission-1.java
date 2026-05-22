class Solution {
    public int lengthOfLongestSubstring(String s) {
     Map<Character,Integer> map = new HashMap<>();
     int max=0;
     int left  =0;
     for(int right=0;right<s.length();right++){
        while(map.containsKey(s.charAt(right))){
        map.remove(s.charAt(left));
        left++;
        }
        map.put(s.charAt(right),1);
        max = Math.max(max,map.size());
     }   
     return max;
    }
}
