import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/4/19.
 * My email : errrrorer@foxmail.com
 */
public class GrayCode {
    public List<Integer> grayCode(int n) {
        int sum = (int)Math.pow(2,n);
        List<Integer> res = new ArrayList<Integer>(sum);
        for (int i=0;i<sum;i++){
            res.add((i)^(i>>1));
        }
        return res;
    }
}
