package SumOfTwoIntegers;

/**
 * sumOfTwoIntegers
 */
public class sumOfTwoIntegers {

    private static int sumOfTwoInteger(int a,int b)
    {
        while(b != 0)
        {
            int temp=(a&b)<<1;
            a= a^b;
            b= temp; 
        }
        return a;
    }

    public static void main(String[] args) {
        int a=5,b=6;
       int sum=sumOfTwoInteger(a, b);
        System.out.println(sum);
    }
}