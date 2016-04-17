import java.util.*;

/**
 * Created by YGZ on 2016/3/24.
 */
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        if (matrix.length==0) return;
        HashSet<Integer> set = new HashSet<Integer>();
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i=0;i<row;i++){
            boolean tem = false;
            for (int j=0;j<col;j++){
                if (matrix[i][j]==0){
                    tem = true;
                    set.add(j);
                }
            }
            if (tem){
                for (int k=0;k<col;k++){
                    matrix[i][k] = 0;
                }
            }
        }
        if (set.size()!=0){
            Iterator<Integer> iterator = set.iterator();
            while(iterator.hasNext()){
                int i=iterator.next();
                for (int j=0;j<row;j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
