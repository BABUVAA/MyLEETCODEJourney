package HarshedNumber;

public class harshedNumber {
    
    private static int harshedNumberBasic(int x) {
        int sum=0;
        int xx=x;
        while(x>0)
        {
            sum=sum+x%10;
            x/=10;
        }
        if(xx%sum==0)
            return sum;
       
        return -1;
    }
    public static void main(String[] args) {
       System.out.println(harshedNumberBasic(23));
    }

 
}
