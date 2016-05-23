import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/5/23.
 * My email : gzyang1125@foxmail.com
 */
public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        if (rowIndex==0) {
            res.add(1);
            return res;
        }
        res.add(1);
        double result = 1;
        for (int i=1,j=rowIndex;i<=rowIndex/2;){
            result = result/i*j;
            res.add((int)Math.round(result));
            i++;
            j--;
        }
        int j=0;
        if (rowIndex%2==1){
            j = rowIndex/2;
        }else {
            j = rowIndex/2-1;
        }
        for (;j>=0;j--){
            res.add(res.get(j));
        }
        return res;
    }
}
