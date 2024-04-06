package FindMinimumInSortedArray;

public class findMininmumInSortedArray {
    private static int findMininmumInSortedArrayBruteForce(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        return min;
    }


    private static void findMininmumInSortedArrayOptimal(int[] nums) {
         

    }

 
    public static void main(String[] args) {
        int []nums={4,5,1,2,3};
        findMininmumInSortedArrayBruteForce(nums);
        findMininmumInSortedArrayOptimal(nums);
    }


    
}
