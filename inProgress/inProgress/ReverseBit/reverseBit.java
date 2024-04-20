package inProgress.ReverseBit;

public class reverseBit {
    private static long reverseBits(long n) {
        int  num=0;
       int factor=1;
           
           while(n!=0)
           {
               if((1&n)!=0)
               {
                  num=num+factor;         
               }
               n=n>>1;
               factor*=2;       
               System.out.println("NUM: "+num+" factor: "+factor+ "  n: "+n);
            }
           return num;
       }

    public static void main(String[] args) {
        long n= 964176191;
        System.out.println(reverseBits(n));

    }
}
/*
 * 
 */