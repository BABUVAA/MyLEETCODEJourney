package Blind75.DP.CoinChange;

import java.util.HashMap;

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




private static int coinChangeOptimal(HashMap<Integer,Integer>memo,int[]coins,int amount)
{
    

if(amount==0)
    return 0;
if(amount<0)
    return -1;

if(memo.containsKey(amount))
     return memo.get(amount);
int minCoin=-1;
for (int i : coins) {
    int subAmount=amount-i;
    int subCoin=coinChangeOptimal(memo, coins, subAmount);
    if(subCoin!= -1)
    {
     int numCoins=subCoin + 1;
     if(numCoins<minCoin || minCoin == -1)   
        minCoin = numCoins;
    }
    
}

memo.put(amount,minCoin);
return minCoin;
}

    public static void main(String[] args) {
    int[] coin={1,2,3};
        int amount=4;
        System.out.println(coinChangeSol(coin, amount));
        System.out.println(coinChangeOptimal(new HashMap<>(), coin, amount));
    }
    
}
