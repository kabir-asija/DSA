class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int m = matrix.length;
        int n=matrix[0].length;
        int high = m*n-1;
        while(low <= high){
            int mid = low + (high-low)/2;

            int row = mid / n;
            int col = mid % n;

            int val = matrix[row][col];

            if(val == target) return true;
            else if (val > target) high = mid-1;
            else low = mid+1; 
        }       
        
        return false;
    }
}
