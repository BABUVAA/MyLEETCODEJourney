package ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;

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
        
            Map<Integer,Integer>count=new HashMap<>();
              for(int i=0;i<nums.length;i++)
              {
                  if(count.get(nums[i])!=null)
                  {
                      return true;
                  }
                  count.put(nums[i],1);
              }
              return false;
        
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,1};
        //System.out.println(containsDuplicateBruteForce(arr));
        System.out.println(containsDuplicateOptimal(arr));
    }
}
