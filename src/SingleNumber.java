import java.util.*;

/**
 * Created by ygz on 2016/10/9.
 * My email : gzyang1125@foxmail.com
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }
    //大牛的操作
    public int singleNumber1(int[] nums) {
        int res = 0;
        for (int i=0;i<nums.length;i++){
            res ^= nums[i];
        }
        return res;
    }
}
