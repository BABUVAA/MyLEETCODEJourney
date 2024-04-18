package ClimbingStairs;

public class climbingStairs {
    private static int climbingStairsRec(int n) {
        if(n<=1)
            return 1;
        
        int op1=climbingStairsRec(n-1);
        int op2=climbingStairsRec(n-2);
        return op1+op2;

    }
    
    private static int climbingStairsOptimal(int n, int[]memo) {
        if(n<=1)
            return 1;
        if(memo[n]>0)
        return memo[n];
        int op1=climbingStairsOptimal(n-1,memo);
        int op2=climbingStairsOptimal(n-2,memo);
        memo[n]=op1+op2;
        return op1+op2;

    }

    public static void main(String[] args) {
        int n=5;
        int []memo=new int[n+1];
        System.out.println(climbingStairsOptimal(n,memo));
        System.out.println(climbingStairsRec(n));
        
    }

    
}
