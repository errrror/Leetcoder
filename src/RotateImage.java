/**
 * Created by YGZ on 2016/3/1.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        if (matrix.length<1) return;
        int n = matrix[0].length;
        for (int i=0;i<(n+1)/2;i++){
            for (int j=i;j<n-i-1;j++){
                int tem = matrix[i][j];
                matrix[i][j] = matrix[n-1-j][i];
                matrix[n-1-j][i] = matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j] = matrix[j][n-1-i];
                matrix[j][n-1-i] = tem;
            }
        }
    }
    public static void main(String args[]){
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage.rotate(matrix);
        System.out.println(matrix);
    }
}
