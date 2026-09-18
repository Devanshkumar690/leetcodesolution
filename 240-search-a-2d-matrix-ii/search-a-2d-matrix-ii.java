class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;//no. of rows
        int m = matrix[0].length;//no.of colums

        int row = n-1;//last row
        int col = 0;//first column

        while(row>=0 && col<m){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                row--;
            }
            else{
                col++;
            }
        }
        return false;
        // complexity: worst case or O(n+m) means we
        //we delete each and every row and column
    }
}