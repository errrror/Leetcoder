/**
 * Created by YGZ on 2016/3/28.
 */
public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length<=0) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int resrow = 0;
        for (;resrow<row;){
            if (matrix[resrow][col-1]==target){
                return true;
            }else if (matrix[resrow][col-1]<target){
                resrow++;
            }else{
                break;
            }
        }
        if (resrow==row){
            return false;
        }
        int i=0,j=col-1;
        while(i<j){
            if (matrix[resrow][i]==target||matrix[resrow][j]==target){
                return true;
            }
            if (matrix[resrow][(i+j)/2]<target){
                i=(i+j)/2 + 1;
            }else if (matrix[resrow][(i+j)/2]>target){
                j=(i+j)/2 - 1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] agrs){
        int[][] m = {{1},{3}};
        int target = 3;
        Searcha2DMatrix searcha2DMatrix = new Searcha2DMatrix();
        System.out.println(searcha2DMatrix.searchMatrix(m,target));
    }
}
