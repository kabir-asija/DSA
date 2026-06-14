class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Always binary search on the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;

        int totalLeft = (m + n + 1) / 2;
        int left = 0, right = m;

        while (left <= right) {
            int i = (left + right) / 2;   // partition in nums1
            int j = totalLeft - i;        // partition in nums2

            int nums1Left = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int nums1Right = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int nums2Left = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int nums2Right = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (nums1Left <= nums2Right && nums2Left <= nums1Right) {
                // Correct partition found
                if ((m + n) % 2 == 1) {
                    return Math.max(nums1Left, nums2Left);
                } else {
                    return (Math.max(nums1Left, nums2Left) + Math.min(nums1Right, nums2Right)) / 2.0;
                }
            } else if (nums1Left > nums2Right) {
                // Move partition left
                right = i - 1;
            } else {
                // Move partition right
                left = i + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }
}