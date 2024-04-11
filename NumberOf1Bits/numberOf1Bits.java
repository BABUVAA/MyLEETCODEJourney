package NumberOf1Bits;

public class numberOf1Bits {
    private static int numOF1Bits(int n) {
        int count=0;
       while(n!=0)
        {   //GETBIT FUNCTION
             int bitMAsk= 1<<0;
             if((bitMAsk & n)!=0) 
                 count++;
           
            n=n>>1;          
        }
        return count;
    }

    public static void main(String[] args) {
        int n=4;
        numOF1Bits(n);
    }
}

   
