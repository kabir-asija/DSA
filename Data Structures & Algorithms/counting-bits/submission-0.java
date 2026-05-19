class Solution {
    public int[] countBits(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = countOnes(i);
        }
        return nums;
    }
    public int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n = n >>> 1;
        }
        return count;
    }
}
