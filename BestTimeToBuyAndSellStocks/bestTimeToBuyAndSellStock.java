package BestTimeToBuyAndSellStocks;

/**
 * bestTimeToBuyAndSellStock
 */
public class bestTimeToBuyAndSellStock {
    //BRUTE FORCE APPROACH
    public static int maxProfitBruteForce(int[] prices) {
        int max=0;
        for(int i=0;i<prices.length-1;i++)
        {
            for(int j=i+1;j<prices.length;j++)
            {
                if(prices[i]>=prices[j])
                    continue;
                if( max<(prices[j]-prices[i]))
                {
                    max=prices[j]-prices[i];
                }
            }
        }
        return max;
    }
    //OPTIMAL APPROACH USING TWO POINTER
    public static int maxProfitOptimal(int[] prices) {
        int max=0;
        int buy=0,sell=1;
      while(sell<prices.length)
      {
        if(prices[buy]<prices[sell])
                max=Math.max(max,prices[sell]-prices[buy]);
        else
            buy=sell;
            sell++;    
      }
        return max;
    }
    public static void main(String[] args) {
         int[]arr={1,2};
        // System.out.println(maxProfitBruteForce(arr));
         System.out.println(maxProfitOptimal(arr));

    }
}