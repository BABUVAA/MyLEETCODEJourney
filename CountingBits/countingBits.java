package CountingBits;

public class countingBits {
    private static int[] countBits(int n) {
       int[]result=new int[n+1];      
        for (int i = 0; i <=n; i++) {
            int a=i;
            int sum=0;
            while(a!=0)
            {
                if((1 & a)!=0)
                    sum++;
                
                    a=a>>1;
            }
            result[i]=sum;
       } 
        return result;
    }


    public static void main(String[] args) {
        int n=5;
        int[]result=countBits(n);

        for (int i : result) {
            System.out.print(i+",");
        }

    }
}
