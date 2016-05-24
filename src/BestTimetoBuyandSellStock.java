import java.util.Arrays;

/**
 * Created by YGZ on 2016/5/24.
 * My email : gzyang1125@foxmail.com
 */
public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length<=0) return 0;
        int max=0;
        int min=prices[0];
        for (int i=0;i<prices.length;i++){
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
}
