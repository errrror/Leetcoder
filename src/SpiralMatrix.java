import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/3/8.
 */
public class SpiralMatrix{
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if (matrix == null) return res;
        if (matrix.length==0) return res;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i=0;i<=(row-1)/2;i++){
            int endX = row-1-i;
            int endY = col-1-i;
            int actrow = i;
            int actcol = i;
            if (endY<0||endX<0) return res;
            for (;actcol<=endY;actcol++){
                res.add(matrix[actrow][actcol]);
            }
            actrow +=1;
            actcol -=1;
            if (actrow<=endX&&actcol>=i&&actcol<=endY) {
                for (;actrow<=endX;actrow++){
                    res.add(matrix[actrow][actcol]);
                }
                actcol -= 1;
                actrow -=1;
            }
            if (actcol>=i&&actrow>=i&&actrow<=endX) {
                for (; actcol >= i; actcol--) {
                    res.add(matrix[actrow][actcol]);
                }
                actrow -= 1;
                actcol +=1;
            }
            if (actrow<endX&&actrow>i&&actcol>=i&&actcol<=endY) {
                for (; actrow > i; actrow--) {
                    res.add(matrix[actrow][actcol]);
                }
            }
        }
        return res;
    }
    public static void main(String args[]){
        int[][] matrix = {{1},{2},{3},{4},{5},{6},{7},{8},{9},{10}};
        //int[][] matrix = {{1,2,3,4,5,6,7,8,9,10}};
        //int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        System.out.println(spiralMatrix.spiralOrder(matrix));
    }
}
