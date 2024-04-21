package CoinChange;

import javax.print.DocFlavor.INPUT_STREAM;

public class coinChange {
    
private static int coinChangeSol(int[]coins, int amt)
{  
if(amt<1)return 0;
int [] minCoinsDP= new int[amt+1];
for (int i = 1; i <= amt; i++) {
    minCoinsDP[i]=Integer.MAX_VALUE;

    for (int coin : coins) {
        if(coin<=i && minCoinsDP[i-coin]!=Integer.MAX_VALUE)
        {
            minCoinsDP[i]=Math.min(minCoinsDP[i], 1+ minCoinsDP[i-coin]);

        }
    }

}
if (minCoinsDP[amt]==Integer.MAX_VALUE) {
    return -1;
}
return minCoinsDP[amt];
}


    public static void main(String[] args) {
    int[] coin={1,2,5};
        int amount=11;
        System.out.println(coinChangeSol(coin, amount));
    }
    
}
