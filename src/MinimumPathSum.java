/**
 * Created by YGZ on 2016/3/17.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        if (row==0) return 0;
        int col = grid[0].length;
        if (col==0) return 0;
        int sum = 0;
        int[][] tem = new int[row][col];
        for (int i=0;i<col;i++){
            tem[0][i] = sum + grid[0][i];
            sum += grid[0][i];
        }
        sum = 0;
        for (int j=0;j<row;j++){
            tem[j][0] = sum + grid[j][0];
            sum += grid[j][0];
        }
        for (int i=1;i<row;i++){
            for (int j=1;j<col;j++){
                tem[i][j] = grid[i][j] + Math.min(tem[i-1][j],tem[i][j-1]);
            }
        }
        return tem[row-1][col-1];
    }
    public static void main(String args[]){
        int[][] tem = {{1,2},{5,6},{1,1}};
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        System.out.println(minimumPathSum.minPathSum(tem));
    }
}
