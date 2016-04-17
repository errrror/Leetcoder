import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YGZ on 2016/3/14.
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        if (k==0) return null;
        String res = "";
        List<Character> nums = new ArrayList<Character>(Arrays.asList('1','2','3','4','5','6','7','8','9'));
        int[] total = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};
        if (k>total[n]) return null;
        int lag = n;
        for (int i=0;i<lag;i++){
            int p = (k-1)/total[n-1];
            res += nums.get(p);
            nums.remove(p);
            if (k%total[n-1]==0){
                k = total[n-1];
            }else {
                k %= total[n-1];
            }
            n = n-1;
        }
        return res;
    }
    public static void main(String args[]){
        PermutationSequence permutationSequence = new PermutationSequence();
        System.out.println(permutationSequence.getPermutation(3,1));
    }
}
