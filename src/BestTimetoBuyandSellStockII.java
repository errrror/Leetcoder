/**
 * Created by YGZ on 2016/5/24.
 * My email : gzyang1125@foxmail.com
 */
public class BestTimetoBuyandSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length==0) return 0;
        int min = prices[0],max = 0,result = 0;
        for (int i=0;i<prices.length;i++){
            if (max<prices[i]-min){
                max = prices[i]-min;
                min = Math.min(min,prices[i]);
            }else {
                result+=max;
                min = prices[i];
                max = 0;
            }
        }
        return result+max;
    }

    public static void main(String[] args) {
        int[] res = {6,1,2,3,4,2,7};
        BestTimetoBuyandSellStockII bestTimetoBuyandSellStockII = new BestTimetoBuyandSellStockII();
        System.out.println(bestTimetoBuyandSellStockII.maxProfit(res));
    }
}
