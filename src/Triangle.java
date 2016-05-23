import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by YGZ on 2016/5/23.
 * My email : gzyang1125@foxmail.com
 */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0) return 0;
        int size = triangle.size();
        int tem,tem1,tem2;
        for(int i=1;i<size;i++){
            int length = triangle.get(i).size();
            for (int j=0;j<length;j++){
                tem = triangle.get(i).get(j);
                if (j==0){
                    tem1 = triangle.get(i-1).get(j);
                    triangle.get(i).set(j,tem+tem1);
                }else if (j==length-1){
                    tem2 = triangle.get(i-1).get(j-1);
                    triangle.get(i).set(j,tem2+tem);
                }else {
                    tem1 = triangle.get(i-1).get(j);
                    tem2 = triangle.get(i-1).get(j-1);
                    triangle.get(i).set(j,tem2>tem1?tem1+tem:tem2+tem);
                }
            }
        }
        Collections.sort(triangle.get(size-1));
        return triangle.get(size-1).get(0);
    }

    public static void main(String[] args) {

    }
}
