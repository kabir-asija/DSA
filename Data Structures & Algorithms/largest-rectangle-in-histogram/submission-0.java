class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int h = heights[i];
            int leftMost = i;
            while (leftMost >= 0 && heights[leftMost] >= h) {
                leftMost--;
            }
            int rightMost = i + 1;
            while (rightMost < n && heights[rightMost] >= h) {
                rightMost++;
            }
            leftMost++;
            rightMost--;
            maxArea = Math.max(maxArea, h * (rightMost - leftMost + 1));
        }
        return maxArea;
    }
}
