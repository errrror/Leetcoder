/**
 * Created by YGZ on 2016/3/15.
 */
public class UniquePathsII {
    /*public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid.length<0) return 0;
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if (row==1||col==1){
            for (int i=0;i<row;i++){
                for (int j=0;j<col;j++){
                    if (obstacleGrid[i][j] == 1) return 0;
                }
            }
        }
        long res = helper(row-1,col-1);
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (obstacleGrid[i][j] == 1){
                    res -= helper(i,j)*helper(row-i,col-j);
                }
            }
        }
        return (int)res;
    }
    public static long helper(int m,int n){
        int min = Math.min(m,n);
        int up = m+n;
        long  res = 1;
        for (int i=1;i<=min;i++){
            res *= up--;
            res /= i;
        }
        return res;
    }*/
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                }
                else {
                    if(i == 0 && j == 0) obstacleGrid[i][j] = 1;
                    else if(i == 0 && j > 0) obstacleGrid[i][j] = obstacleGrid[i][j-1];
                    else if(i > 0 && j == 0) obstacleGrid[i][j] = obstacleGrid[i-1][j];
                    else obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[m-1][n-1];
    }
    public static void main(String args[]){
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] res = {{0,1,0,0},{0,1,0,0},{1,0,0,0},{0,0,0,0}};
        System.out.println(uniquePathsII.uniquePathsWithObstacles(res));
    }
}
