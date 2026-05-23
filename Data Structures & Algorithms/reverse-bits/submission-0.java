class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32; i++) {
            int last = n & 1;
            rev = (rev << 1) | last;
            n = n >>> 1;
        }
        return rev;
    }
}
