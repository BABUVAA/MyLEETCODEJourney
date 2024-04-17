package inProgress.ClimbingStairs;

public class climbingStairs {
    private static int climbingStairs(int n) {
        int way=1;
        if(n==2)
        {return 2;}
        int a=n,b=n-1;
        while(a>1)
        {
            a-=2;
            way++;
        }
        while(b>1)
        {way++;
            b-=2;
        }

        return way;
        
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(climbingStairs(n));
        
    }

    
}
