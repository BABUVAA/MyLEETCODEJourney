package Blind75.Array.FindMinimumInSortedArray;

public class findMininmumInSortedArray {
    private static int findMininmumInSortedArrayBruteForce(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        return min;
    }


    private static int findMininmumInSortedArrayOptimal(int[] nums) {
         int low=0;
         int high=nums.length-1;
        int min=Integer.MAX_VALUE;
         while(low<=high)
         {
           int mid=(low+high)/2;
            if(nums[low]<=nums[mid])
            {   min=Math.min(min,nums[low]);
                low=mid+1;
            }
            else
            {
                min=Math.min(min, nums[mid]);
                high=mid-1;
            }         
         }
         return min;
    }

 
    public static void main(String[] args) {
        int []nums={4,5,12,3,4};
        System.out.println(findMininmumInSortedArrayBruteForce(nums));
       System.out.println(findMininmumInSortedArrayOptimal(nums));
    }


    
}
