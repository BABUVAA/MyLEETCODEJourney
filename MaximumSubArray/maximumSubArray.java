package MaximumSubArray;
/**
 * maximumSubArray
 */
public class maximumSubArray {

    static int maximumSubArrayBruteForce(int[] nums)
    {
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {        
               int sum=0;
                for (int k = i; k <= j; k++) {
                    sum+=nums[k];
                }
                max=Math.max(max, sum);
            }
        }

        return max;
    }

    
    static int maximumSubArrayBetter(int[] nums)
    {
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {        
              sum+=nums[j];    
              max=Math.max(max, sum);                  
            }
            
        }
        return max;
    }

    static int maximumSubArrayOptimal(int[] nums)
    {
        int max=nums[0];
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
         sum+=nums[i];

            if(sum>max)
            {
                max=sum;
            }
            if (sum<0) {
            sum=0;
          }         
        }
        return max;
    }

    //PRINTING MAX SUBARRAY
    static void maximumSubArrayPrint(int[] nums)
    {
        int max=nums[0];
        int sum=0;
        int start=0,ansStart=-1,end=-1;

        for (int i = 0; i < nums.length; i++) {
             if(sum==0)
                start=i;

         sum+=nums[i];

            if(sum>max)
               { max=sum;
                 ansStart=start;
                 end=i;
                }

            if (sum<0) 
                sum=0;
        }
      for (int i = ansStart; i <=end; i++) {
        System.out.print(nums[i]);
      }
    }

    public static void main(String[] args) {
        int []nums={-5,-2,1,2,3,5};
    //  System.out.println(maximumSubArrayBetter(nums));
    //System.out.println(maximumSubArrayOptimal(nums));
        maximumSubArrayPrint(nums);
    }
}