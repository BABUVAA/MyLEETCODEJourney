package MaximumProductSubArray;

public class maximumProductSubArray {


    static int  maximumProductSubArrayBruteforce(int[] nums)
    {
        int max=nums[0];
       
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int maxPro=1;
                for (int k = i; k <=j; k++) {
                    maxPro=maxPro*nums[k];    
                }   
                max=Math.max(maxPro, max);
            }
        }
        
        return max;
    }

    static int maximumProductSubArrayBetter(int[] nums)
    {
        int max=nums[0];
      
       
        for (int i = 0; i < nums.length; i++) {
            int maxPro=1;
            for (int j = i; j < nums.length; j++) {
            maxPro*=nums[j];
            max=Math.max(maxPro, max);
            }
        }
        
        return max;
      
     
    }

    static void maximumProductSubArrayOptimal(int[] nums)
    {
        int max=Integer.MIN_VALUE;
        int maxPro=1;
        for(int i=0;i<nums.length;i++)
        {   
            maxPro*=nums[i];
            
            if(maxPro<1)
                maxPro=nums[i];
            
            if(maxPro>max)
                max=maxPro;
               
        }
      
     
    }


    public static void main(String[] args) {
     // System.out.println(maximumProductSubArrayBruteforce(new int[]{-2,0,-1}));
     //System.out.println(maximumProductSubArrayBetter(new int[]{-2,-1,2}));
   System.out.println(maximumProductSubArrayBetter(new int[]{-1,0,-2}));
        
    }
    
}
