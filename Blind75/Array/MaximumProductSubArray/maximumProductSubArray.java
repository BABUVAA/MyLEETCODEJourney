package Blind75.Array.MaximumProductSubArray;

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

    static int maximumProductSubArrayOptimal(int[] nums)
    {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int pre=1;
        int suff=1;
        for(int i=0;i<nums.length;i++)
        {   
            if(pre==0)
                pre=1;
            if(suff==0)
             suff=1;    
            pre*=nums[i];
            suff*=nums[n-1-i];      
               max=Math.max(max,Math.max(pre,suff));

        }
      return max;
     
    }
    static int maximumProductSubArrayKadaneOptimal(int[] nums)
    {
    
        int prod1 = nums[0],prod2 = nums[0],result = nums[0];
    
        for(int i=1;i<nums.length;i++) {
            
            int temp = Math.max(nums[i],Math.max(prod1*nums[i],prod2*nums[i]));
            prod2 = Math.min(nums[i],Math.min(prod1*nums[i],prod2*nums[i]));
            prod1 = temp;
            
            result = Math.max(result,prod1);
        }
        System.out.println(result);
      return result;
     
    }



    public static void main(String[] args) {
      //System.out.println(maximumProductSubArrayBruteforce(new int[]{-2,0,2,-4}));
   // System.out.println(maximumProductSubArrayBetter(new int[]{-2,-4,0,2}));
  // System.out.println(maximumProductSubArrayOptimal(new int[]{-2,3,-4}));
    maximumProductSubArrayKadaneOptimal(new int[]{-2,0,2,-4,5,6,-2});    
    }
    
}
