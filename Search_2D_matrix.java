//time commplexity - O(logn)

//space complexity - O(1)


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null || matrix.length==0) return false;
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            int r=mid/m;
            int c=mid%m;
            if(matrix[r][c]==target) return true;
            else if (matrix[r][c]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
       return false; 
    }
}
