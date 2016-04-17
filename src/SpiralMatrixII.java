/**
 * Created by YGZ on 2016/3/11.
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n==0) return res;
        /*if (n==1) {
            int[][] result = {{1}};
            return result;
        }*/
        int num = 1;
        int row = 0;
        int col = 0;
        for (int i=0;i<=(n-1)/2;i++){
            for (;col<=n-1-i;){
                res[row][col] = num++;
                col++;
            }
            col -= 1;
            row += 1;
            if (row<=n-1-i){
                for (;row<=n-1-i;row++){
                    res[row][col] = num++;
                }
            }
            row -= 1;
            col -= 1;
            if (col>=i){
                for (;col>=i;col--){
                    res[row][col] = num++;
                }
            }
            col += 1;
            row -= 1;
            if (row>i){
                for (;row>i;row--){
                    res[row][col] = num++;
                }
            }
            row += 1;
            col += 1;
        }
        return res;
    }
    public static void main(String args[]){
        int n = 1;
        SpiralMatrixII spiralMatrix = new SpiralMatrixII();
        int[][] res = spiralMatrix.generateMatrix(n);
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
