class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=0;
        for(int num: set){
            int curr = num;
            int streak=1;
            while(set.contains(curr+1)){
                streak++;
                curr++;
            }
            max = Math.max(max, streak);
        }
        return max;
    }
}
