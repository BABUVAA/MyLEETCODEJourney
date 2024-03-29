package ContainsDuplicate;

public class containsDuplicate {
    public static boolean containsDuplicateBruteForce(int[] nums) {
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                    return true;
            }
        }
        return false;
    }
    public static boolean containsDuplicateOptimal(int[] nums)
    {
        return false;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,1};
        
    }
}
